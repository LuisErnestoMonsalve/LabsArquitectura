
package calculadora;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.net.*;

public class Calculadora2 extends UnicastRemoteOBject implements  Calculadora {
    public Calculadora2() throws RemoteException {super();}   
    public long sumar(long A, long B) throws RemoteException { return A + B;}
    public long restar(long A, long B) throws RemoteException { return A - B;}
    public long multiplicar(long A, long B) throws RemoteException { return A * B;}
    public long dividir(long A, long B) throws RemoteException { return A / B;}
}
