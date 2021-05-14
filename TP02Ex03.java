/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.*/

import java.io.IOException;
import java.util.Scanner;

public class TP02Ex03 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char repetir;
		int[] valor;		
		int valorN, maiorValor = 0, soma = 0, somaNeg = 0, somaPos = 0;
		double media, porcNeg, porcPos;

		do {
			System.out.println("Entre com valor N:");
			valorN = sc.nextInt();
			while (valorN % 2 != 0 || valorN > 20) {
				if (valorN % 2 != 0) {
					System.out.println("Valor negativo");
				}
				if (valorN > 20){
					System.out.println("Valor maior que 20");
					}
				System.out.println("Entre com valor N:");
				valorN = sc.nextInt();
			}
			valor = new int[valorN];
			
			for (int i = 0; i < valorN; i++)
			{
				System.out.println("Insira o valor " + (i + 1) + ":");
				valor[i] = sc.nextInt();			
			}
			
			for (int i = 0; i < valorN; i++)
			{
				if (valor[i] > maiorValor) {
					maiorValor = valor[i];
				}
				if (valor[i] % 2 == 0) {
					somaPos++;
				}
				else {
					somaNeg++;
				}
				soma += valor[i];
				System.out.println("Valor " + (i + 1) + ": " + valor[i]);
			}
			
			System.out.println("Maior Valor: " + maiorValor);
			System.out.println("Soma: " + soma);		
			media = (double)soma / valorN;
			System.out.println("Média: " + media);
			porcPos = (double)somaPos * 100 / valorN;
			porcNeg = (double)somaNeg * 100 / valorN;
			System.out.println("Soma dos valores positivos: " + somaPos);
			System.out.println("Soma dos valores negativos: " + somaNeg);
			System.out.println("Porcentagem de valores positivos: " + porcPos + "%");
			System.out.println("Porcentagem de valores negativos: " + porcNeg + "%");
			maiorValor = soma = somaNeg = somaPos = 0;
			System.out.println("Repetir operação? (S/N)");
			repetir = (char)System.in.read();
		} while (repetir == 's' || repetir == 'S');
		
		sc.close();
	}

}
