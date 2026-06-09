package encapsulamento_e_herança;

public class Professor extends Pessoa{
    
     private String discicplina;

        public String getDisciplina(){
            return discicplina;
        }

        public void setDisciplina(String disciplina){
            this.discicplina = disciplina;
        }

        void mostrarDados(){
        System.out.println("\n|| DADOS ||");
        System.out.println("\nNome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Disciplina: " + discicplina);
    }
}
