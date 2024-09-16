/*Faça um programa para criar três vetores de inteiros de 5 posições, 
preencher dois desses vetores, preencher o terceiro vetor com a soma dos dois
primeiros e mostrar os três na tela.*/

package exemplosUmATres;
import io.InOut;

public class ExemploTres {

	public static void main(String[] args) {
		int[] vetorUm = new int[5];
		int[] vetorDois = new int[5];
		int[] vetorSoma = new int[5];
		
		for(int i = 0; i < vetorUm.length; i++) {
			vetorUm[i] = (int)(Math.random() * 10 + 1);
			vetorDois[i] = (int)(Math.random() * 10 + 1);
			vetorSoma[i] = vetorUm[i] + vetorDois[i];
			InOut.msgSemIcone(null, "VetorUm[" + i + "] = " + vetorUm[i]
					+ "\nVetorDois[" + i + "] = " + vetorDois[i]
					+ "\nVetorSoma[" + i + "] = " + vetorSoma[i]);
		}
	}
}
