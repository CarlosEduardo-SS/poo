public class Produto {
    

    String nome;
    double preco;
    int quantidade;
    double media;
    static double precoCaro = 0;
    static String nomeCaro;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorTotal(){
        return preco * quantidade;
    }

    void mostrarDados(){
        if (preco > precoCaro ) {
            precoCaro = preco;
            nomeCaro = nome;
        }

        System.out.println("\nProduto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("\nValor total do produto: R$ " + calcularValorTotal());
        System.out.println("O produto mais caro é: " + nomeCaro + " R$ " + precoCaro);
    }
}
