package exercicioUm;
import io.InOut;
import java.util.Scanner;

public class AppAluno {

	public static void main(String[] args) {
		
		String nome;
		int matricula;
		double nota1, nota2;
		
		nome = InOut.leString("Nome do primeiro aluno: ");
		matricula = InOut.leInt("Matrícula do primeiro aluno: ");
		nota1 = InOut.leDouble("Nota 1 do primeiro aluno: ");
		nota2 = InOut.leDouble("Nota 2 do primeiro aluno: ");
		
		Aluno aluno1 = new Aluno(nome, matricula, nota1, nota2);
		double media1 = aluno1.calcularMedia();
		
		nome = InOut.leString("Nome do segundo aluno: ");
		matricula = InOut.leInt("Matrícula do segundo aluno: ");
		nota1 = InOut.leDouble("Nota 1 do segundo aluno: ");
		nota2 = InOut.leDouble("Nota 2 do segundo aluno: ");
		
		Aluno aluno2 = new Aluno(nome, matricula, nota1, nota2);
		double media2 = aluno2.calcularMedia();
		
		InOut.msgSemIcone("Dados do primeiro aluno:", "Nome: " + aluno1.getNome() +
				"\nMatrícula: " + aluno1.getMatricula() + 
				"\nNota 1: " + aluno1.getNota1() + 
				"\nNota 2: " + aluno1.getNota2() +
				"\nMédia: " + media1);
		
		InOut.msgSemIcone("Dados do segundo aluno:", "Nome: " + aluno2.getNome() +
				"\nMatrícula: " + aluno2.getMatricula() + 
				"\nNota 1: " + aluno2.getNota1() + 
				"\nNota 2: " + aluno2.getNota2() +
				"\nMédia: " + media2);
		
		
		nota1 = InOut.leDouble("Atualize a Nota 1 do primeiro aluno: ");
		aluno1.setNota1(nota1);
		InOut.msgSemIcone("Nota 1 do primeiro aluno atualizada:", "Nota 1 atualizada: " + aluno1.getNota1());
		
	}
	
	public static void ordemAlfabetica(String nome1, String nome2) {
		if (nome1.compareTo(nome2) < 0) {
            System.out.println("Ordem alfabética:");
            System.out.println(nome1);
            System.out.println(nome2);
        } else {
            System.out.println("Ordem alfabética:");
            System.out.println(nome1);
            System.out.println(nome2);
        }

        scanner.close();
    }
}