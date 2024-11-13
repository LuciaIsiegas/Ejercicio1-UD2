package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce tu apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("Tu nombre es " + nombre + " " + apellido);
		
		sc.close();

	}

}
