package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double suma = 0;
		
		for(int i = 1; i <= 2; i++) {
			System.out.print("Introduce un número: ");
			suma += sc.nextDouble();
		}
		
		System.out.println("La suma de ambos números es: " + suma);
		
		sc.close();

	}

}
