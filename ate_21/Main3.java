import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar? ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        Aluno[] alunos = new Aluno[quantidade]; 

        for(int i = 0; i < quantidade; i++){

            System.out.println("\nAluno " + (i + 1));

            System.out.print("Digite o nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.print("Digite a primeira nota do aluno: ");
            double nota1 = leitor.nextDouble();

            System.out.print("Digite a segunda nota do aluno: ");
            double nota2 = leitor.nextDouble();
            leitor.nextLine();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        aluno.calcularMedia();
        aluno.verificarSituacao();

        alunos[i] = aluno;

        }

        System.out.println("\nDados dos alunos");

        for(int i = 0; i < alunos.length; i++){
            alunos[i].mostrarDados();
        }

        System.out.println("\nDigite o nome do aluno que deseja buscar: ");
        String nomeBusca = leitor.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i].nome.equalsIgnoreCase(nomeBusca)) {

                System.out.println("\nAluno encontrado!");
                alunos[i].mostrarDados();

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno nao encontrado");
        }

        leitor.close();
    }
}
