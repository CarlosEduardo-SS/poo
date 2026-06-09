package encapsulamento_e_herança;

public class Vendedor extends Funcionario{
    
    private int quantidadeVendas;

    public int getQuantidadeVendas(){
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas){
        this.quantidadeVendas = quantidadeVendas;
    }

    public double calcularSalarioFinal(){
        return getSalario() + (quantidadeVendas * 50);
    }
}
