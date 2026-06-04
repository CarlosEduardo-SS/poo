package sobrecarga_de_construtores;

public class ContaBancaria2c {
    
    String nome;
    double saldo = 0;
    double valorDeposito = 10;
    double valorSaque = 10;

    public ContaBancaria2c(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    public ContaBancaria2c(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    void alterarSaldo(double saldoNovo){
        this.saldo = saldoNovo;
    }

    void depositar(){
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.print("\n=====================================\n");
            System.out.print("\nDepósito de R$ " + valorDeposito + " realizado com sucesso!\n");
        } else {
            System.out.print("\n=====================================\n");
            System.out.print("\nValor de depósito inválido!\n");
        }
    }

    void sacar(){
        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.print("\n=====================================\n");
            System.out.print("\nSaque de R$ " + valorSaque + " realizado com sucesso!\n");
        } else {
            System.out.print("\n=====================================\n");
            System.out.print("\nValor de saque inválido ou saldo insuficiente!\n");
            
        }
    }

    void mostrarSaldo(){
        System.out.print("\n=====================================\n");
        System.out.println("\n|-- SALDO --|");
        System.out.println("Titular: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}

    
