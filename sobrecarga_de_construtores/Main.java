package sobrecarga_de_construtores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        Produto2c p1 = new Produto2c("uva", 10.90);
        Produto2c p2 = new Produto2c("pera", 5.99, 10);

        p1.mostrarDados();
        p2.mostrarDados();

        leitor.close();
    }
}
