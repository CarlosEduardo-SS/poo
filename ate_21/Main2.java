import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ArrayList<Produto> estoque = new ArrayList<>();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\nMenu:");
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Mostrar produtos");
            System.out.println("3- Mostrar valor total do estoque");
            System.out.println("4- Buscar produto por nome");
            System.out.println("5- Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("\nDigite o nome do produto: ");
                    String nome = leitor.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = leitor.nextDouble();

                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = leitor.nextInt();
                    leitor.nextLine();

                    Produto produto = new Produto(nome, preco, quantidade);

                    estoque.add(produto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                    case 2:
                        if (estoque.isEmpty()) {
                            System.out.println("\nNenhum produto cadastrado!");
                        } else {
                            System.out.println("\nProdutos cadastrados:");
                            for (Produto p : estoque) {
                                p.mostrarDados();
                            } 
                        }

                        break;

                        case 3:
                            double valorTotal = 0;
                            for (Produto p : estoque) {
                                valorTotal += p.preco * p.quantidade;
                            }
                            System.out.printf("\nValor total do estoque: R$ %.2f\n", valorTotal);
                            break;

                            case 4:
                                System.out.print("\nDigite o nome do produto que deseja buscar: ");
                                String nomeBusca = leitor.nextLine();
                                boolean encontrado = false;
                                for (Produto p : estoque) {
                                    if (p.nome.equalsIgnoreCase(nomeBusca)) {
                                        p.mostrarDados();
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (!encontrado) {
                                    System.out.println("\nProduto não encontrado!");
                                }
                                break;

                        case 5:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;

                }
            }
            leitor.close();
    }
}   
