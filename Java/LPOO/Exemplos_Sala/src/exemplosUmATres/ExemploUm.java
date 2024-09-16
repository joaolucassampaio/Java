/*Faça um programa para ler dois números inteiros e mostrar no console a
soma, a diferença, a multiplicação e a divisão desses dois números.*/

package exemplosUmATres;
import io.InOut;

public class ExemploUm {

	public static void main(String[] args) {
		int primeiroNumero = InOut.leInt("Primeiro Número:");
		int segundoNumero = InOut.leInt("Segundo Número:");
		
		int soma = primeiroNumero + segundoNumero;
		int diferenca = primeiroNumero - segundoNumero;
		int multiplicacao = primeiroNumero * segundoNumero;
		int divisao = primeiroNumero / segundoNumero;
		
		InOut.msgSemIcone(null, "Soma:" + soma
				+ "\nDiferença: " + diferenca
				+ "\nMultiplicação: " + multiplicacao
				+ "\nDivisão: " + divisao);
	}

}
