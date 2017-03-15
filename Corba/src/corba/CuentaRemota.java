
package corba;


public interface CuentaRemota extends java.rmi.Remote {
        public long mostrarSaldo() throws java.rmi.RemoteException;
        public void ingreso(long importe) throws java.rmi.RemoteException;
        public void reintegro(long importe)throws java.rmi.RemoteException;
        public void transeferencia(CuentaRemota cuenta, long importe)throws java.rmi.RemoteException;    
}
