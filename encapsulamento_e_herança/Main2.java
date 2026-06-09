package encapsulamento_e_herança;

import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();

        int opcao = 0;

        System.out.print("=====================================\n");
        System.out.print("\nDigite o nome do titular: ");
        contaBancaria.setTitular(leitor.nextLine());

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
                contaBancaria.depositar();
                break;

            case 2:
                contaBancaria.sacar();
                break;

            case 3:
                contaBancaria.mostrarSaldo();
                break;

            case 4:
                System.out.println("Saindo...");
                break;
        }

        }

        leitor.close();
    }
}
