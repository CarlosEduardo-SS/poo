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

    void calcularMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("A média aritmética do aluno " + nome + " é: " + media);

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
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        if (media >= 7) {
            aprovados++;        
        } else{
            reprovados++;
        }

        soma = soma + media;

        double mediaGeral = soma / quantidade;

        System.out.print("Total de aprovados: " + aprovados + "\n");
        System.out.print("Total de reprovados: " + reprovados + "\n");
        System.out.print("O aluno " + melhorAluno + " tem a maior média de " + maiorMedia + "\n");
        System.out.print("O aluno " + piorAluno + " tem a menor média de " + menorMedia + "\n");
        System.out.print("Média geral da turma: " + mediaGeral + "\n");
    }
}        

