package sobrecarga_de_construtores;

public class Aluno2c {
    
    String nome;
    double nota1;
    double nota2;
    double media;

    public Aluno2c(String nome){
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public Aluno2c(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void alterarAsNotas(double novaNota1, double novaNota2){
        this.nota1 = novaNota1;
        this.nota2 = novaNota2;
    }

    void calcularMedia(){
        media = (nota1 + nota2) / 2;
    }

    void mostrarDados(){
        System.out.println("\n|-- DADOS --|");
        System.out.println("Nome: " + this.nome);
        System.out.println("1° Nota: " + this.nota1);
        System.out.println("2° Nota: " + this.nota2);
        System.out.println("Média: " + this.media);
    }
}
