/*Faça um programa para criar um vetor de inteiros de 3 posições, preencher
esse vetor e mostrá-lo na tela.*/

/*Vetores são estruturas de dados que armazenam usualmente uma quantidade
 fixa de dados de um certo tipo.*/

/*Internamente, um vetor armazena diversos valores, cada um associado a
 um número que se refere à posição de armazenamento, e é conhecido como
 índice.*/

/*A memória heap é uma área de memória dedicada para armazenar objetos e 
variáveis instanciadas em tempo de execução.*/

package exemplosUmATres;
import io.InOut;

public class ExemploDois {

	public static void main(String[] args) {
		// Sintaxe declaração:
		//tipoDado[] nomeVetor;
		int[] vetor;
		
		// Sintaxe alocação de espaço na memória heap:
		vetor = new int[3];
		
		for(int i = 0; i < vetor.length; i++) {
			// O método Math.random retorna dados do tipo double
			// Para fazê-lo retornar inteiros basta acrescentar (int) como prefixo
			vetor[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			InOut.msgSemIcone(null, "Vetor" + "[" + i + "]" + " = " + vetor[i]);
		}
	}

}
