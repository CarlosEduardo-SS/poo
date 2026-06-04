public class Carro {
    
    String modelo;
    int velocidadeAtual = 0;
    int velocidadeMaxima = 0;
    int acelerar = 10;
    int frear = 10;

    public Carro(String modelo, int velocidadeAtual, int velocidadeMaxima){
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

      void acelerar(){
        if (velocidadeAtual >= velocidadeMaxima) {
            System.out.println("\nNão é possível acelerar! Você já atingiu a Velocidade Máxima (" + velocidadeMaxima + " km/h)!!");
        } else {
            velocidadeAtual += acelerar;
            System.out.println("\nAcelerando...");
        }
    }

     void frear(){
        if (velocidadeAtual <= 0) {
            System.out.println("\nVocê já está parado!");
        } else {
            velocidadeAtual -= frear;
            System.out.println("\nFreando...");
        }
    }

    void mostrarVelocidade(){
        System.out.print("\nCarro: " + modelo + "\n");
        System.out.print("Velocidade Atual: " + velocidadeAtual + "km/h\n");
        System.out.print("Velocidade Máxima cadastrada: " + velocidadeMaxima + " km/h\n");
    }
}
