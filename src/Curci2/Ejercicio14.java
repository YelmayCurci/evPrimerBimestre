package Curci2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner (System.in); 


		boolean pagoEntrada = true;
		int edad;
	

		System.out.println("Ingrese su edad: ");
		edad = ingreso.nextInt();

		if (edad > 0 && edad >= 18) {
			System.out.println("¿Pagaste la entrada?");
		
			if (pagoEntrada == true) {
				System.out.println("Si.");
				System.out.println("Podes pasar." );

			} else {
				System.out.println("No.");
				System.out.println("No podes pasar.");
			}
		}
		 else {
			System.out.println("No podes pasar.");
		}

	}

	
}
