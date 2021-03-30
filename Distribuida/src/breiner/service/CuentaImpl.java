/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breiner.service;

import breiner.db.AccesoDB;
import breiner.service.spec.CuentaSpec;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author brein
 */
public class CuentaImpl implements CuentaSpec {

    /*MOVIMIENTOS*/
    public List<Map<String, ?>> getMovimientos(String cuenta) {
        List<Map<String, ?>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select cuencodigo, monenombre, cuensaldo, cuenestado, "
                    + "movinumero, movifecha, moviimporte, tipocodigo, tiponombre "
                    + "from distribuidas.v_movimiento where cuencodigo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, cuenta);
            ResultSet rs = pstm.executeQuery();
            lista = JdbcUtil.rsToList(rs);
            rs.close();
            pstm.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

    /*REGISTRAR RETIRO*/
    @Override
    public void registrarRetiro(String estado,String cuenta, Double importe, String codEmp, String clave) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            String sql = "{call usp_retiro(?,?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1,estado);
            cstm.setString(2, cuenta);
            cstm.setDouble(3, importe);
            cstm.setString(4, codEmp);
            cstm.setString(5, clave);
            cstm.executeUpdate();
            cstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error de acceso a la tabla Cliente.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    /*REGISTRAR DEPOSITO*/
    public void registrarDeposito(String estado,String cuenta, double importe, String empleado) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            String sql = "{call usp_deposito(?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1,estado);
            cstm.setString(2, cuenta);
            cstm.setDouble(3, importe);
            cstm.setString(4, empleado);
            cstm.executeUpdate();
            cstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error de acceso a la tabla Cliente.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    /*REGISTRAR TRANSFERENCIA*/
    @Override
    public void registrarTransferencia(String estado,String cuenta1, String cuenta2, String clave1,Double importe, String codEmp) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            String sql = "{call usp_transferencia(?,?,?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setString(1,estado);
            cstm.setString(2, cuenta1);
            cstm.setString(3, cuenta2);
            cstm.setString(4, clave1);
            cstm.setDouble(5, importe);
            cstm.setString(6, codEmp);
            
            cstm.executeUpdate();
            cstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error de acceso a la tabla Cliente.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}
