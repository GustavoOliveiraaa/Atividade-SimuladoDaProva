
public class SegundaDivisao extends Time{
    //Atributos da segunda divisão + Time
  private int anosSegundaDivisao;
  
  public SegundaDivisao (String nome, int quantidadeSocios, int anosSegundaDivisao) {
    super(nome, quantidadeSocios);
    this.anosSegundaDivisao = anosSegundaDivisao;
    }
    
    //Get e Set
    
    public int getAnos(){
        return this.anosSegundaDivisao;
    }
    
    public int setAnos (int anosSegundaDivisao) {
        return this.anosSegundaDivisao = anosSegundaDivisao;
    }
    
    //ToString
    
    public String toString (){
        return super.toString() + "\nQuantidade de anos na segunda divisão: "+ anosSegundaDivisao;
    }
}
