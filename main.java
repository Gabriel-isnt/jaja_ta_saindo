public class Main{
    
        public static void main(String[] args){
        
        
        }
}


abstract class Pessoa{
        
        private int id;
        private String nome;
        
        public Pessoa(int id, String nome){
                this.id = id;
                this.nome = nome;
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


class Aeromocas extends Pessoa{
        
        public Aeromocas(int id, String nome){
                super(id, nome);
        }
}


class Passageiro extends Pessoa{
        
}


class Aviao{
        
        private boolean[] lugares;
        private boolean status;
        
        public Aviao(){
                this.lugares = new boolean[250];
                this.status = false;
        }
        
        public void ocuparAcentos(int posicao){
                
                if(posicao < 0 || posicao > 249){
                        System.out.println("escolha uma posição entre 0 e 249");
                        return;
                }
                
                boolean ocupado = lugares[posicao];
                
                if(ocupado){
                        System.out.println("Esse lugar está ocupado");
                        return;
                }
                
                lugares[posicao] =  true;
                System.out.println("Seu lugar foi garantido :)");
        }
        
        
}




