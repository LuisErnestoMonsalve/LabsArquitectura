/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.rmi.*;

public interface Calculadora extends Remote{
    public long sumar(long A, long B) throws RemoteException;
    public long restar(long A, long B) throws RemoteException;
    public long multiplicar(long A, long B) throws RemoteException;
    public long dividir(long A, long B) throws RemoteException;
}
