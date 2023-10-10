package Ej4;

import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(Calculadora.suma(500, -4));
		pedirNumero(teclado);
	}

	public static int pedirNumero(Scanner teclado) {

		// Declaracíon de variables locales del metodo

		String valorIntroducido = "";
		boolean valorValido = false;
		int numero = 0;

		do {
			System.out.print("Introduce un numero del 1 al 500: ");
			valorIntroducido = teclado.nextLine();
			
			try {

				numero = Integer.parseInt(valorIntroducido);

				if (numero > 0 && numero <= 500) {
					valorValido = true;
				} else {
					System.out.println("El numero que intentas adivinar está entre 1 y 500. \n\n");
				}
			} catch (Exception e) {
				System.out.println("Valor no válido \n\n");
			}

		} while (!valorValido);

		return numero;
	}
}
