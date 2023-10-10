package Ej5;

import java.util.Random;

public class Password {
	
	private String contraseña = "";
	private int longitud = 8;
	
	public Password() {
		this.generarPassword();
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.generarPassword();
	}
	
	public void generarPassword() {
		
		boolean valorValido = false;
		int valorNum = 0;
		Random random = new Random();
		
		
		for(int i = 0; i < this.longitud; i++) {
			valorValido = false;
			do { //65-122 valores ascii validos
				valorNum = (int) Math.round(Math.random() * (122-48) + 48);
				
				//Si está fuera de los dos rangos de caracteres especiales
				if(!(valorNum >= 58 && valorNum <= 64) && !(valorNum >= 91 && valorNum <= 96)) {
					valorValido = true;
					this.contraseña += (char)valorNum;
				}
				
			} while (!valorValido);
		}
	}
	
	public boolean esFuerte() {
		
		int numNumeros = 0;
		int numMayus = 0;
		int numMinus = 0;
		char charEval = ' ';
		
		for(int i = 0; i < this.longitud; i++) {
			charEval = this.contraseña.charAt(i);
			//Comprobar si el codigo ascii del char corresponde con el rango de los numeros, mayusculas o minusculas
			if(((int)charEval) >= 48 && ((int)charEval) <= 57) {
				numNumeros++;
			} else if(((int)charEval) >= 65 && ((int)charEval) <= 90) {
				numMayus++;
			} else if(((int)charEval) >= 97 && ((int)charEval) <= 122) {
				numMinus++;
			}
		}
		
		return numMayus > 2 && numMinus > 1 && numNumeros > 5;
	}
	
	public String getContraseña() {
		return this.contraseña;
	}
	
	public int getLongitud() {
		return this.longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		this.generarPassword();
	}
}

