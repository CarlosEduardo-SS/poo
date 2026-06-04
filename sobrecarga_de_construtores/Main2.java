package sobrecarga_de_construtores;

import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Aluno2c a1 = new Aluno2c("Lucas");
        Aluno2c a2 = new Aluno2c("Carlos", 10.0, 8.5);

        a1.alterarAsNotas(7.5, 8.9);
        a1.calcularMedia();
        a1.mostrarDados();
        a2.calcularMedia();
        a2.mostrarDados();

        leitor.close();
    }
}
