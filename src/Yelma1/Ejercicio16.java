package Yelma1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese el número del café: ");
		numero = ingreso.nextInt();
		
		switch (numero) {
		
		case '1':
			System.out.println("Café cortado.");
			break;
			
		case '2':
			System.out.println("Café latte.");
			break;
			
		case 3:
			System.out.println("Café solo.");
			break;
			
		case 4:
			System.out.println("Café lágrima.");
			break;
			
		case 5:
			System.err.println("Salir del programa.");
		// los numeros van entre comillas simples???
		}
	}

}
