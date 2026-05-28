import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar? ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        for(int i = 0; i < quantidade; i++){

            System.out.print("Digite o nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.print("Digite a primeira nota do aluno: ");
            double nota1 = leitor.nextDouble();

            System.out.print("Digite a segunda nota do aluno: ");
            double nota2 = leitor.nextDouble();
            leitor.nextLine();

        Aluno aluno = new Aluno();

        aluno.nome = nome;
        aluno.nota1 = nota1;
        aluno.nota2 = nota2;

        aluno.calcularMedia();
        aluno.verificarSituacao();

        }

        leitor.close();
    }
}
