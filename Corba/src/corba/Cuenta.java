
package corba;

import java.rmi.RemoteException;

class Cuenta extends java.rmi.server.UnicastRemoteObject implements CuentaRemota{
    
    private long saldo;
    private long numero;
    private static long numCuentas ;
    
    Cuenta() throws java.rmi.RemoteException{
        numero=++numCuentas;
    }
    
    public long mostrarSaldo() throws java.rmi.RemoteException{
      return saldo;
    }
    
    public void ingreso(long importe)throws java.rmi.RemoteException{
    saldo+=importe;
}
    public void reintegro(long importe) throws java.rmi.RemoteException{
        saldo-=importe;
    }
    
    public void transeferencia(CuentaRemota cuenta, long importe) throws RemoteException {
       reintegro(importe);
        cuenta.ingreso(importe);
    }
   

}
            
