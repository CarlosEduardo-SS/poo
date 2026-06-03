public class Aluno {
    

    String nome;
    double nota1;
    double nota2;
    double media;
    static int aprovados = 0;
    static int reprovados = 0;
    static double maiorMedia = 0;
    static String melhorAluno;
    static double menorMedia = 10;
    static String piorAluno;
    static double soma = 0;
    static int quantidade = 0;
    String situacao;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void calcularMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("\nA média aritmética do aluno " + nome + " é: " + media);

        quantidade++;

        if (media > maiorMedia) {
            maiorMedia = media;
            melhorAluno = nome;
        }

        if (media < menorMedia) {
            menorMedia = media;
            piorAluno = nome;
        }
    }

    void verificarSituacao(){
        if (media >= 7) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";

        }

        if (media >= 7) {
            aprovados++;        
        } else{
            reprovados++;
        }

        soma = soma + media;

        double mediaGeral = soma / quantidade;

        System.out.print("\nSituação do aluno: " + situacao + "\n");
        System.out.print("\nTotal de aprovados: " + aprovados + "\n");
        System.out.print("Total de reprovados: " + reprovados + "\n");
        System.out.print("\nO aluno " + melhorAluno + " tem a maior média = " + maiorMedia + "\n");
        System.out.print("O aluno " + piorAluno + " tem a menor média = " + menorMedia + "\n");
        System.out.print("\nMédia geral da turma: " + mediaGeral + "\n");
    }

    void mostrarDados(){
        System.out.println("\nNome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}        

