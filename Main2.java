import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos serão cadastrados?");
        int produtos = leitor.nextInt();
        leitor.nextLine();

        for(int i = 0; i < produtos; i++){
            System.out.print("Digite o nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = leitor.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        Produto produto = new Produto();

        produto.nome = nome;
        produto.preco = preco;
        produto.quantidade = quantidade;

        produto.mostrarDados();
        }

        leitor.close();
    }
}
