package encapsulamento_e_herança;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();
        
        System.out.print("\nDigite o nome do aluno: ");
        aluno.setNome(leitor.nextLine());

        System.out.print("Digite a primeira nota do aluno: ");
        aluno.setNota1(leitor.nextDouble());

        System.out.print("Digite a segunda nota do aluno: ");
        aluno.setNota2(leitor.nextDouble());

        System.out.println("\n|| DADOS DO ALUNO ||");
        System.out.println("\nNome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("\nMédia: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao() + "\n");

        leitor.close();
    }
}
