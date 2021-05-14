/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.*/

import java.util.Scanner;

public class TP02Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;		
		System.out.println("Insira o valor 1:");
		valor1 = sc.nextInt();		
		System.out.println("Insira o valor 2:");
		valor2 = sc.nextInt();
		
		do {
			System.out.println("Insira o valor 2:");
			valor2 = sc.nextInt();
		} while (valor1 >= valor2);
		
		System.out.println("Valor 1 = " + valor1);
		System.out.println("Valor 2 = " + valor2);
		sc.close();
	}
}