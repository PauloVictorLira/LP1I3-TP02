/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.*/

import java.util.Scanner;

public class TP02Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int m, n;
		
		System.out.println("Para a matriz MxN, digite o valor de M:");
		m = sc.nextInt();
		while (m > 10) {
			System.out.println("Insira o valor de M até 10:");
			m = sc.nextInt();
		}
		
		System.out.println("Digite o valor de N:");
		n = sc.nextInt();
		while (n > 10) {
			System.out.println("Insira o valor de N até 10:");
			n = sc.nextInt();
		}
		
		int a[][] = new int [m][n];
		int b[][] = new int [n][m];
		int i,j;
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.println("Digite a linha " + (i + 1) + "/coluna " + (j + 1) + ":");
				a[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				b[i][j] = a[j][i];
			}
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.printf("%3d   ", b[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}