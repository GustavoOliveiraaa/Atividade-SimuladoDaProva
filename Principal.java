public class Principal{
    public static String nomesAleatorios () {
        String[] nome = {"Gustavo", "Eduardo", "Sabino", "Felippo", "Arthur", "Vini;cius", "Pedro", "Vitor", "Leonardo", "Willian", "Fernanda", "Flavia", "Ronaldo", "Danilo", "Alonso", "Julia", "Rafael" , "Dante", "Franscisco", "Rodrigo"};
        int nomeNumero = (int)(Math.random() * nome.length);
        String nomeAleatorio = nome[nomeNumero];
        return nomeAleatorio;
    }
    
    public static void main (String [] args) {
        Time[] times = null;
        int quantidadeTimes = -1;
        
        String nomeDoTime = "";
        int quantidadeSocios = 0;
        int campeao = 0;
        int posicaoInicial= 0;
        int posicao = 0;
        int anos = 0;
        
        while (quantidadeTimes <= 0 || quantidadeTimes > 50) {
            quantidadeTimes = Teclado.leInt ("Insira a quantidade de time: ");
            if (quantidadeTimes > 0 && quantidadeTimes <= 50) {
                times = new Time[quantidadeTimes];
                break;
            }
            System.out.println ("Insira um número entre 1 e 50: ");
        }
       
        for(int i=0; i < quantidadeTimes; i++) {
            int aleatorio = (int)(Math.random() + 0.5);
            if (aleatorio == 0) {
                System.out.println ("Time" + (i + 1) + "da primeira divisão");
                nomeDoTime = Teclado.leString ("Informe o nome do time: ");
                quantidadeSocios = Teclado.leInt ("Informe a quantidade de sócios do time: ");
                posicao = Teclado.leInt ("Informe a posicão do time: ");
                if (posicao >= 1) {
                    posicaoInicial = posicao;
                    campeao = i;
                }
                times[i] = new PrimeiraDivisao (nomeDoTime, quantidadeSocios,posicao );
            }
            else {
                System.out.println ("Time" + (i + 1) + "da segunda divisão");
                nomeDoTime = Teclado.leString ("Informe o nome do time: ");
                quantidadeSocios = Teclado.leInt ("Informe a quantidade de sócios do time: ");
                posicao = Teclado.leInt ("Informe a posicão do time: ");
                times[i] = new SegundaDivisao (nomeDoTime, quantidadeSocios, posicao);
                }
            }
            
        for (int i=0; i < times.length;i++) {
            for (int ia=0; ia < times[i].getQuantidadeSocios();ia++) {
                
                String nome = nomesAleatorios();
                int idade = (int)(Math.random() * 83 + 18);
                Socio x = new Socio (nome, idade);
                
                times[i].insereSocio(x);
            }
            String continuar = Teclado.leString ("Aperte enter para continuar");
        }
        
        for (int i=0; i < times.length;i++) {
            System.out.println (times[i].toString());
            System.out.println("\nSócios do Time: " +times[i].getNome());
            times[i].imprimeSocios();
            String maisVelho = times[i].socioMaisVelho();
            System.out.println ("\n O sócio mais velho do time é: " +maisVelho);
            }
            
            System.out.println("Time com melhor colocação. ");
            System.out.println(times[campeao]);
        }
    }

