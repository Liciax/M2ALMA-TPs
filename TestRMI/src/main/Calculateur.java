package main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculateur extends Remote {
	
	public String somme(int x, int y) throws RemoteException;
}
