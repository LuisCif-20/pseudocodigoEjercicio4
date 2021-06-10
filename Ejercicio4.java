import java.util.*;
public class Ejercicio4{
	public static void main(String[] args) {
		int edad;
		int menor;
		int mayor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la primer edad");
		edad = scan.nextInt();
		menor = edad;
		mayor = edad;
		for (int i = 0; i < 19 ; i++ ) {
			System.out.println("Ingrese la siguiente edad");
			edad = scan.nextInt();
			if (edad >= mayor) {
				mayor = edad;
			} else if (edad < menor) {
				menor = edad;			
			}
		}
		System.out.println("La edad mayor es " + mayor);
		System.out.println("La edad menor es " + menor);
	}
}