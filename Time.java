public class Time{
    //Atributos + Array Socios
   private String nome;
   private Socio[] socios;
   private int quantidadeSocios;
   
   public Time (String nome, int quantidadeSocios) {
        this.nome = nome;
        this.quantidadeSocios = quantidadeSocios;
        this.socios = new Socio[quantidadeSocios];
        if (quantidadeSocios > 20)
            this.socios = new Socio[20];
    }
    
    //Getters
    
    public String getNome() {
        return this.nome;
    }
    
    public int getQuantidadeSocios (){
        return this.quantidadeSocios;
    }
    
    public Socio[] getSocios(){
        return this.socios;
    }
    
    //ToString
    
    public String toString() {
        return "\n Nome: " + nome + " Quantidade de sócios cadastrados: " + socios.length;
    }
    
    //Insere Sócios
    
    public boolean insereSocio (Socio novoSocio) {
        for (int i=0; i < quantidadeSocios; i++) {
            if (i < 20) {
                if (socios[i] == null) {
                    socios[i] = novoSocio;
                    System.out.println (" Sócio "+ (i+1) + " do time " + nome + " inserido com sucesso\n" );
                    return true;
                }
            }
        }
        System.out.println ("Erro, o sócio não foi inserido.\n");
        return false;
    }
    
    //Sócio mais velho
    public String socioMaisVelho () {
        String nomeDoVelho = "";
        int idadeMaior = 0;
        for (int i=0; i < socios.length; i++) {
            if (socios[i] == null)
            break;
            if (socios[i].getIdade() > idadeMaior) {
                idadeMaior = socios[i].getIdade();
                nomeDoVelho = socios[i].getNome();
            }
        }
        return nomeDoVelho;
    }
    
    //Imprime Sócios
    
    public void imprimeSocios() {
        for (int i=0; i < socios.length; i++) {
            if (socios[i] == null)
                break;
            System.out.println (socios[i].toString());
        }
    }
}
