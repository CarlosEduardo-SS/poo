import java.util.Scanner;

public class Main5 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        System.out.print("\nDigite o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.print("Velocidade atual: ");
        int velocidadeAtual = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Velocidade Máxima: ");
        int velocidadeMaxima = leitor.nextInt();
        leitor.nextLine();

        Carro carro = new Carro(modelo, velocidadeAtual, velocidadeMaxima);

        while (opcao != 4) {
            System.out.print("\n|-- MENU --|\n");
            System.out.print("1- Acelerar\n");
            System.out.print("2- Frear\n");
            System.out.print("3- Mostrar velocidade\n");
            System.out.print("4- Sair\n");
            System.out.print("\nEscolha uma opção:");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;
            
                case 2:
                    carro.frear();
                    break;

                case 3:
                    carro.mostrarVelocidade();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }

        leitor.close();
    }
}
