package Yelma1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner (System.in);
		
		int contrasena;
		int intentos=0;
		
		do {

			System.out.println("Ingresa la contrasena: ");
			contrasena = ingreso.nextInt();

			if (contrasena != 2008) {
				Thread.sleep(1000); 
				intentos++; 
				
				if (intentos <3) {
					System.out.println("Contrasena incorrecta. intento: "+ intentos);
					System.out.println("Volve a intentarlo. ");
					
				}
			
			}

		} while (contrasena != 2008 && intentos < 3);

		if (contrasena == 2008) {
			System.out.println("Contrasena correcta.");
		}
		if (contrasena != 2008) 
			System.err.println("Bloqueado. ");
			
		
		
	}

}
