package com.tariq.rmicalcserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.tariq.rmicalcimpl.CalculatorImplementation;

public class CalcServer {
	
	public static void main(String [] args){
		try{
			System.setProperty("java.rmi.server.hostname","192.168.96.4");
			Registry reg  = LocateRegistry.createRegistry(2001);
			CalculatorImplementation calcImpl = new CalculatorImplementation();
			reg.rebind("calculator", calcImpl);
			
			System.out.println("Server started successfully!");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
