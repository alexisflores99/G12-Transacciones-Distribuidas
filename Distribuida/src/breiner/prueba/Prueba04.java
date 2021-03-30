package breiner.prueba;

import breiner.service.CuentaImpl;
import breiner.service.spec.CuentaSpec;



public class Prueba04 {
    // REGISTRAR DEPOSITO
    public static void main(String[] args) {
        try {
            CuentaSpec cuentaService = new CuentaImpl();
            cuentaService.registrarDeposito("","00100001", 1000, "0003");
            System.out.println("Se registro depósito");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
