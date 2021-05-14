/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.*/

import java.util.Scanner;

public class TP02Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valor;
		valor = new int[10];
		int maiorValor = 0, soma = 0;
		double media;

		System.out.println("Entre com 10 valores positivos");
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Insira o valor " + (i + 1) + ":");
			valor[i] = sc.nextInt();
			while (valor[i] % 2 != 0) {
				System.out.println("Valor negativo");
				System.out.println("Insira o valor " + (i + 1) + ":");
				valor[i] = sc.nextInt();
			} 
		}
		
		for (int i = 0; i < 10; i++)
		{
			if (valor[i] > maiorValor) {
				maiorValor = valor[i];
			}
			soma += valor[i];
			System.out.println("Valor " + (i + 1) + ": " + valor[i]);
		}
		
		System.out.println("Maior Valor: " + maiorValor);
		System.out.println("Soma: " + soma);		
		media = (double)soma / 10;
		System.out.println("Média: " + media);
		
		sc.close();
	}

}
