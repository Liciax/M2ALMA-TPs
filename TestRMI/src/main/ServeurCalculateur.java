package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServeurCalculateur extends UnicastRemoteObject implements Calculateur {

	protected ServeurCalculateur() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String somme(int x, int y) {
		return "result = " + (x+y);
	}
}
