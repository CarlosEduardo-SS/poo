package encapsulamento_e_herança;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Alunoh alunoh = new Alunoh();
        Professor professor = new Professor();

        //Aluno
       System.out.print("\nDigite o nome do Aluno: ");
       alunoh.setNome(leitor.nextLine());
       System.out.print("Digite a Idade do(a) " + alunoh.getNome() + ": ");
       alunoh.setIdade(leitor.nextInt());
       System.out.print("Digite a nota do(a) " + alunoh.getNome() + ": ");
       alunoh.setNota(leitor.nextDouble());

       leitor.nextLine();

       //Professor
        System.out.print("\nDigite o nome do Professor: ");
       professor.setNome(leitor.nextLine());
       System.out.print("Digite a Idade do(a) " + professor.getNome() + ": ");
       professor.setIdade(leitor.nextInt());
       leitor.nextLine();
       System.out.print("Digite a disciplina do(a) " + professor.getNome() + ": ");
       professor.setDisciplina(leitor.nextLine());
       

       alunoh.mostrarDados();
       professor.mostrarDados();

       leitor.close();

    }
}
