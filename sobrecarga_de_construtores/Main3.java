package sobrecarga_de_construtores;

import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        ContaBancaria2c c1 = new ContaBancaria2c("Beatriz");
        ContaBancaria2c c2 = new ContaBancaria2c("Carlos", 100);

        c1.alterarSaldo(50);
        c1.mostrarSaldo();
        c1.sacar();
        c1.mostrarSaldo();
        c1.depositar();
        c1.mostrarSaldo();

        c2.mostrarSaldo();
        c2.sacar();
        c2.mostrarSaldo();
        c2.depositar();
        c2.mostrarSaldo();

        leitor.close();
    }
}
