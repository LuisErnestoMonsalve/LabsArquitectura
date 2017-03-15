
package calculadora;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
        
public class CalculadoraClient {
    public static void main (String [] args){
        try{
            Calculadora c = (Calculadora)
            Naming.lookup("rmi://localhost/CalculadoraService");
            System.out.println(c.restar(4,3));
            System.out.println(c.sumar(4,5));
            System.out.println(c.multiplicar(3,6));
            System.out.println(c.dividir(9,3));
        } catch (MalformedURLException murle){
            System.out.println();
            System.out.println("MalformedURLException");
            System.out.println(murle);
        } catch (RemoteException re){
            System.out.println();
            System.out.println("RemoteException");
            System.out.println(re);
        }
    }
}
