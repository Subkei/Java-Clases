import java.util.Scanner;

public class MatrizBi {

	public static void main(String[] args) {

		int arreglo[][] = new int[2][2];
		Scanner leer;
		
		int i,j;
		leer = new Scanner(System.in);
		
		leer.close();
		for(i=0;i<arreglo.length;i++) {
			for(j=0;j<arreglo.length;j++) {
				System.out.println("ingrese numeros");
				arreglo[i][j] = leer.nextInt();
			}
		}
		
		for(i=0;i<arreglo.length;i++) {
			for(j=0;j<arreglo.length;j++) {
				System.out.println(arreglo[i][j]);
			}
		}
	}
}