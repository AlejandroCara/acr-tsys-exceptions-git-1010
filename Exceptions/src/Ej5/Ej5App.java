package Ej5;

public class Ej5App {

	public static void main(String[] args) {

		
		
		Password pwd = new Password(20);
		
		do {
			pwd = new Password(20);
			if(pwd.esFuerte()) {
				System.out.println("La contraseña " + pwd.getContraseña() + " es fuerte");
			} else {
				System.out.println("La contraseña " + pwd.getContraseña() + " no es fuerte");
			}
		} while(!pwd.esFuerte());
		
		
	}

}
