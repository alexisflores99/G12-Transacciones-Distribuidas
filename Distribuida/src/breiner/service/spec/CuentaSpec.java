/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breiner.service.spec;

import java.util.List;
import java.util.Map;

/**
 *
 * @author brein
 */
public interface CuentaSpec {
    /*REGISTRAR MOVIMIENTOS*/
    public List<Map<String, ?>> getMovimientos(String cuenta);
    /*REGISTRAR RETIRO*/
    void registrarRetiro(String estado,String cuenta, Double importe, String codEmp,String clave);
    /*REGISTRAR DEPOSITO*/
    void registrarDeposito(String estado,String cuenta, double importe, String empleado);
    /*REGISTRAR TRANSFERENCIA*/
    void registrarTransferencia(String estado,String cuenta1, String cuenta2, String clave1,Double importe, String codEmp);
}
