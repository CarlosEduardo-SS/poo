package encapsulamento_e_herança;

public class Gerente extends Funcionario{
    
    private double bonus = 100;

    public double calcularSalarioFinal(){
        return getSalario() + bonus;
    }
}
