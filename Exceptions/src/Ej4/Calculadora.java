package Ej4;

public class Calculadora {

	
	public static double suma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double resta(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	public static double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static double raizCuadrada(double num) {
		return Math.sqrt(num);
	}
	
	public static double raizCubica(double num) {
		return Math.cbrt(num);
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
}
