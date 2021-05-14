/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.*/

import java.util.Scanner;

public class TP02Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a[][] = new String [2][3];
		int i,j;
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite a linha " + (i + 1) + "/coluna " + (j + 1) + ":");
				a[i][j] = sc.nextLine();
			}
		}
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%3s   ", a[i][j]);
			}
			System.out.println();

		}
		sc.close();
	}
}