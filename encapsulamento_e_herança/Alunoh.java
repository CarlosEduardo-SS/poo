package encapsulamento_e_herança;

public class Alunoh extends Pessoa {
    
    private double nota;

        public double getNota(){
            return nota;
        }

        public void setNota(double nota){
            this.nota = nota;
        }

        void mostrarDados(){
        System.out.println("\n|| DADOS ||");
        System.out.println("\nNome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nota: " + nota);
    }
}
