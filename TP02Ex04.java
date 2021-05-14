/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.*/

import java.util.Scanner;

public class TP02Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int [2][3];
		int i,j;
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite a linha " + (i + 1) + "/coluna " + (j + 1) + ":");
				a[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%3d   ", a[i][j]);
			}
			System.out.println();

		}
		sc.close();
	}
}