package Ej3;

import java.util.Random;

import Exceptions.ExceptionTry;

public class Ej3App {

	public static void main(String[] args) {

		Random rn = new Random();
		int numero = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Generando numero aleatorio...");
			numero = rn.nextInt(999) + 1;
			System.out.println("Numero generado: " + numero);
			try {
				if(numero % 2 == 0) {
					throw new ExceptionTry("Es par");
				} else {
					throw new ExceptionTry("Es impar");
				}
			} catch (ExceptionTry e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}				
