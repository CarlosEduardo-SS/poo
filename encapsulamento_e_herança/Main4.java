package encapsulamento_e_herança;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
    
            Gerente gerente = new Gerente();
            Vendedor vendedor = new Vendedor();
            
            ArrayList<Funcionario> funcionarios = new ArrayList<>();

            int opcao = 0;

            while(opcao != 4){

                System.out.print("\n-- MENU --" + "\n");
                System.out.print("1- Cadastrar Gerente" + "\n");
                System.out.print("2- Cadastrar Vendedor" + "\n");
                System.out.print("3- Listar Funcionários" + "\n");
                System.out.print("4- Sair" + "\n");
                System.out.print("\n Digite a opção: ");
                opcao = leitor.nextInt();
                leitor.nextLine();

                switch (opcao){

                    case 1:
                        System.out.print("\nDigite o nome do Gerente: ");
                        gerente.setNome(leitor.nextLine());
                        break;

                    case 2:
                        System.out.print("\nDigite o nome do Vendedor: ");
                        vendedor.setNome(leitor.nextLine());
                        break;

                    case 3:
                        System.out.println("Lista de funcionários");
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        break;

                }
            }

    }
}
