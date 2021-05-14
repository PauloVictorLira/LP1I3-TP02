/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

import java.util.Scanner;

public class TP02Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int [3][4];
		int i, j, valorN;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite a linha " + (i + 1) + "/coluna " + (j + 1) + ":");
				a[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%3d   ", a[i][j]);
			}
			System.out.println();

		}
		
		System.out.println("Digite uma constante para multiplicar os valores:");
		valorN = sc.nextInt();
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				
				a[i][j] = a[i][j] * valorN;
			}
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%3d   ", a[i][j]);
			}
			System.out.println();

		}
		
		
		sc.close();
	}
}