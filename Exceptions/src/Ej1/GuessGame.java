package Ej1;

public class GuessGame {
	
	private int num = 0;
	private int intentos = 0;
	private boolean acertado = false;
	
	public GuessGame() {
		this.num = (int) Math.round(Math.random() * (500-1) + 1);
	}
	
	public void guess(int num) {
		
		if(num < this.num) {
			System.out.println("El numero que intentas adivinar es mayor que " + num + "\n\n");
			intentos++;
		} else if (num > this.num) {
			System.out.println("El numero que intentas adivinar es menor que " + num + "\n\n");
			intentos++;
		} else {
			System.out.println("Enhorabuena el numero correcto es " + this.num + ". Has necesitado " + intentos + " intentos.");
			this.acertado = true;
		}
		
	}
	
	public boolean isAcertado() {
		return this.acertado;
	}
}
