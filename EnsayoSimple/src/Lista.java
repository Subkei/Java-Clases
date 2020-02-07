import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
	
		int[] numeros = new int[5];
		try (Scanner leer = new Scanner(System.in)) {
		
		int n;
		
			for(n=0;n<numeros.length;n++) {
				System.out.println("Escriba numeros:");
				numeros[n] = leer.nextInt();
			}
			for(n=0;n<numeros.length;n++) {
				System.out.println(numeros[n]);
			}
		}
	}
}