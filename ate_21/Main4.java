import java.util.Scanner;

public class Main4 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        System.out.print("=====================================\n");
        System.out.print("\nDigite o nome do titular: ");
        String titular = leitor.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = leitor.nextDouble();
        leitor.nextLine();

        ContaBancaria conta = new ContaBancaria(titular, saldo);

        while (opcao != 4) {
            System.out.print("\n=====================================\n");
            System.out.println("\n|-- MENU --|");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Mostrar Saldo");
            System.out.println("4- Sair");
            System.out.print("\n=====================================\n");
            System.out.print("\nEscolha uma Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch(opcao){

            case 1:
                conta.depositar();
                break;

            case 2:
                conta.sacar();
                break;

            case 3:
                conta.mostrarSaldo();
                break;

            case 4:
                System.out.println("Saindo...");
                break;
        }

        }

        leitor.close();
    }
}
