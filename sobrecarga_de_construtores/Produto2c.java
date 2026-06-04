package sobrecarga_de_construtores;

public class Produto2c {
    
    String nome;
    double preco = 0;
    int quantidade = 0;

    public Produto2c(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto2c(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void mostrarDados(){
        System.out.println("\n|-- DADOS --|");
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
