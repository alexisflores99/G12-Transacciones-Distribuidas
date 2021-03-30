/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breiner.prueba;

import breiner.service.CuentaImpl;
import breiner.service.spec.CuentaSpec;

public class Prueba02 {
    // REGISTRAR TRANSFERENCIA
    public static void main(String[] args) {
        try {
            CuentaSpec cuentaService = new CuentaImpl();
            cuentaService.registrarTransferencia("gaa","00100001", "00200001","123456", 100.00, "0001");
            System.out.println("Transferencia realizada");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
