package Yelma1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner (System.in);
		
		int horas, minutos, segundos;
		System.out.println("Ingrese las horas: ");
		horas = ingreso.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		minutos = ingreso.nextInt();
		
		System.out.println("Ingrese los segundos: ");
		segundos = ingreso.nextInt();
		
		if (horas >0 && horas <=24) {
			System.out.println("Valido. ");
	
		}else if (minutos >0 && minutos <=60) {
			System.out.println("Valido. ");
			
		}else if (segundos >0 && segundos <=60) {
			System.out.println("Valido. ");
		}else {
			System.out.println("No es valido. ");
		}
	}
	

}
