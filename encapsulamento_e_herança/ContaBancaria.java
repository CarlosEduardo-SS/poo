package encapsulamento_e_herança;

public class ContaBancaria {
    
    private String titular;
    private double saldo = 0;
    private double valorDeposito = 1000;
    private double valorSaque = 10;

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
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
        System.out.print("=====================================\n");
        System.out.print("\nTitular: " + titular + "\n");
        System.out.print("Saldo: R$ " + saldo + "\n");
        System.out.print("\n=====================================\n");
    }
}
