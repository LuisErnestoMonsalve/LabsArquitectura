
package corba;

import java.rmi.Naming;

public class ServidorRMI {
     public static void main(String[] args) throws Exception{
        Cuenta  c1 = new Cuenta() {};
        Naming.rebind("cuenta1", c1);
        Cuenta  c2 = new Cuenta();
        Naming.rebind("cuenta2", c2);
    }
}
