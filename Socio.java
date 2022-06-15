public class Socio{
    //Atributos do socio
  private String nome;
  private int idade;
  
  public Socio (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Getters e Setters
    public String getNome () {
        return this.nome;
    }
    
    public String setNome (String nome) {
        return this.nome = nome;
    }
    
    public int getIdade (){
        return this.idade;
    }
    
    public int setIdade (int idade) {
        return this.idade = idade;
    }
    
    //ToString
    
    public String toString() {
        return "Dados do sócio" + "\n Nome: "+nome + "\nIdade: "+idade;    
    }
}
