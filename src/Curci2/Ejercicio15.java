package Curci2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		
		char talle;
		System.out.println("Ingrese el talle: ");
		talle = ingreso.next().charAt(0);
		
		switch (talle) {
		case 'M':
			System.out.println("Quedan 2 remeras. ");
			break;
			
		case 'S':
			System.out.println("Quedan 5 remeras. ");
			break;
		
		case 'L':
			System.out.println("No quedan más remeras. ");
			break;
			
		default:System.err.println("Error. ");	
			
			
		}
}
}
