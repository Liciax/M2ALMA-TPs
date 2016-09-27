package main;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestServeurCalculateur {

	public static void main(String[] argv) {
		try {
			Registry registry = LocateRegistry.createRegistry(8002);
			ServeurCalculateur test = new ServeurCalculateur();
			registry.rebind(
			"additionneur",
			test);
			System.out.println("bind");
		}
		catch(Exception e) { System.out.println("erreur");
		}
	}
}
