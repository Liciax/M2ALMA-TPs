package main;

import java.rmi.Naming;
import java.rmi.*;
import java.rmi.registry.*;

public class ClientCalcul {
	
	public static void main(String[] argv){
		try {
			Registry registry = LocateRegistry.getRegistry(8002);
			Calculateur calculateur =
			(Calculateur) registry.lookup(
			"additionneur");
			
			int x = 5;
			int y = 6;
			System.out.println(calculateur.somme(x,y));
		
		}
		catch(Exception e){
		System.out.println("erreur");
		}
	}
}
