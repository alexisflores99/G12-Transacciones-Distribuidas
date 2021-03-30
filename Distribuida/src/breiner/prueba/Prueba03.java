/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breiner.prueba;

import breiner.service.CuentaImpl;
import breiner.service.spec.CuentaSpec;

/**
 *
 * @author brein
 */
public class Prueba03 {
    // REGISTRAR TRANSFERENCIA
    public static void main(String[] args) {
        try {
            CuentaSpec cuentaService = new CuentaImpl();
            cuentaService.registrarRetiro("","00100001",200.00,"0001","123456");
            System.out.println("Retiro realizado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
