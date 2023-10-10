package Ej2;

import Exceptions.ExceptionTry;

public class Ej2App {

	public static void main(String[] args) {

		try {
			throw new ExceptionTry("Esto es un objeto Exception");
		} catch (ExceptionTry e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		}
		
		System.out.println("Programa terminado");
	}	

}
