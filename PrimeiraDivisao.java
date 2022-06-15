public class PrimeiraDivisao extends Time{
    private int posicao;
    
    public PrimeiraDivisao (String nome, int quantidadeSocios, int posicao) {
        super(nome, quantidadeSocios);
        this.posicao = posicao;
    }
    
    //Get e Set
    public int getPosicao(){
        return this.posicao;
    }
    
    public int setPosicao(int posicao) {
        return this.posicao = posicao;
    }
    
    //ToString
    public String toString() {
        return super.toString() + "\nPosição atual: " + posicao;
    }   
}
