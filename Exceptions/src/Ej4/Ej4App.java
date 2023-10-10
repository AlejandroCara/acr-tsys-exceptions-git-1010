package Ej4;

import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Intentar dividir 4 / 0");
			Calculadora.division(4, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n\n");
		try {
			System.out.println("Intentar raiz cuadrada de -4");
			Calculadora.raizCuadrada(-4);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
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
