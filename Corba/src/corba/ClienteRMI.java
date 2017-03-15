
package corba;

import java.rmi.Naming;

public abstract class ClienteRMI implements CuentaRemota {
    public static void main(String[] args) throws Exception{
        CuentaRemota  c1 = (CuentaRemota) Naming.lookup("//localhost/cuenta1");
        CuentaRemota  c2 = (CuentaRemota)Naming.lookup("//localhost/cuenta2");
        c1.ingreso(1000);
        c1.transeferencia(c2, 400);
        //System.out.println("Saldo cuenta 1: "+ c1.mostrarSaldo() + "Saldo cuenta 2: " + mostrarSaldo());
    }
 }

