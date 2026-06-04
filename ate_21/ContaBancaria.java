public class ContaBancaria {
    
    String titular;
    double saldo = 0;
    double valorDeposito = 10;
    double valorSaque = 10;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
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
