public class Main{
    
        public static void main(String[] args){
        
        
                Aviao aviao = new Aviao();
                
                Piloto piloto = new Piloto(1, "piloto");
                CoPiloto copiloto = new CoPiloto(1, "copiloto");
                Aeromoca aeromoca1 = new Aeromoca(1, "aeromoça 1");
                Aeromoca aeromoca2 = new Aeromoca(2, "aeromoça 2");
                
                aviao.ocuparAcentos(piloto, 0);
                aviao.ocuparAcentos(copiloto, 0);
                aviao.ocuparAcentos(copiloto, 1);
                
        
        }
}


abstract class Pessoa{
        
        private int id;
        private String nome;
        
        public Pessoa(int id, String nome){
                this.id = id;
                this.nome = nome;
        }
        
        public String getNome(){
                return nome;
        }
}


class Piloto extends Pessoa{
        
        public Piloto(int id, String nome){
                super(id, nome);
        }
}


class CoPiloto extends Pessoa{
        
        public CoPiloto(int id, String nome){
                super(id, nome);
        }
}


class Aeromoca extends Pessoa{
        
        public Aeromoca(int id, String nome){
                super(id, nome);
        }
}




class Aviao{
        
        private Pessoa[] lugares;
        private boolean status;
        
        public Aviao(){
                this.lugares = new Pessoa[250];
                this.status = false;
        }
        
        public void ocuparAcentos(Pessoa pessoa, int posicao){
                
                if(posicao < 0 || posicao > 249){ 
                        System.out.println("escolha um acento entre 0 e 249");
                        return;
                }
                
                if(lugares[posicao] != null){
                        System.out.printf("O lugar %d está ocupado por %s %n", posicao, lugares[posicao].getNome());
                        return;
                }
                
                lugares[posicao] =  pessoa;
                System.out.printf("Seu lugar na posiçao %d foi garantido %s %n", posicao, pessoa.getNome());
        }
        
        
        
}




