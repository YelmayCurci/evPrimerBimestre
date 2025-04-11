package Curci2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		
		int porcentaje =100;
		

		while (porcentaje > 0) {
			System.out.println("Su batería es: "+porcentaje);
			Thread.sleep(20);
	
			
			
			if (porcentaje ==20) {
				Thread.sleep(1000);
				System.out.println("Batería baja. ");	
			}
		
		porcentaje--;
		
		}
		
			System.out.println("Batería agotada. ");
	}

}
