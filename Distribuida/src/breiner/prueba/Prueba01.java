/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breiner.prueba;

import breiner.service.CuentaImpl;
import breiner.service.spec.CuentaSpec;
import java.util.List;
import java.util.Map;

/**
 *
 * @author brein
 */
public class Prueba01 {

    // REGISTRAR MOVIMIENTO
    public static void main(String[] args) {
        List<Map<String, ?>> lista = null;

        try {
            CuentaSpec cuentaService = new CuentaImpl();
            lista = cuentaService.getMovimientos("00100001");

            lista.forEach((rec) -> {
                /*System.out.println(
                        rec.get("CUENCODIGO").toString() + " - "
                        + rec.get("TIPONOMBRE").toString() + " - "
                        + rec.get("MONENOMBRE").toString() + " - "
                        + rec.get("MOVIIMPORTE").toString() + " - "
                        + rec.get("TIPOCODIGO").toString() + " - "
                        + rec.get("CUENSALDO").toString() + " - "
                        + rec.get("MOVINUMERO").toString() + " - "
                        + rec.get("CUENESTADO").toString() + " - "
                        + rec.get("MOVIFECHA").toString() + " - "
                );*/
                System.out.println(
                        rec.get("CUENCODIGO").toString() + " - "
                        + DevolverTipoCuenta(rec.get("TIPOCODIGO").toString()) + " - "
                        + rec.get("MOVIFECHA").toString() + " - "
                        + rec.get("MOVIIMPORTE").toString()
                );

            });
            System.out.println("PRoceso ok.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    static String DevolverTipoCuenta(String codigoMovimiento) {
        switch (codigoMovimiento) {
            case "001":
                return "Apertura de Cuenta";
            case "002":
                return "Cancelar Cuenta";
            case "003":
                return "Deposito";
            case "004":
                return "Retiro";
            case "005":
                return "Interes";
            case "006":
                return "Mantenimiento";
            case "007":
                return "ITF";
            case "008":
                return "Transferencia";
            case "009":
                return "Transferencia";
            case "010":
                return "Cargo por Movimiento";
            default:
                return "ERROR";
        }
    }
}
