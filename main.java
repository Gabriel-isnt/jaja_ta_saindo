public class main{
    
        public static void main(String[] args){
        
        
                Aviao aviao = new Aviao();
                
                Piloto piloto = new Piloto(1, "xangalanga");
                CoPiloto copiloto = new CoPiloto(1, "mamae");
                Aeromoca aeromoca1 = new Aeromoca(1, "uau");
                Aeromoca aeromoca2 = new Aeromoca(2, "WvW");
                Passageiro pessoa1 = new Passageiro(1, "pspsspspsp");

                
                aviao.ocuparAcentos(piloto, 0);
                aviao.ocuparAcentos(copiloto, 1);
                aviao.ocuparAcentos(aeromoca1, 2);
                aviao.ocuparAcentos(aeromoca2, 3);
                
                aviao.mudaStatus();
                aviao.mudaStatus();

                pessoa1.setAcento(3);
                aviao.ocuparAcentos(pessoa1, pessoa1.getAcento());  

                pessoa1.setAcento(4);
                aviao.ocuparAcentos(pessoa1, pessoa1.getAcento()); 
        
        }
}


abstract class Pessoa{
        
        private int id;
        private String nome;
        protected Integer acento;
        
        public Pessoa(int id, String nome){
                this.id = id;
                this.nome = nome;
                this.acento = null;
        }
        

        public String getNome(){
                return nome;
        }

        public void setAcento(int acento){
                this.acento = acento;
        }

        public Integer getAcento(){
                return acento;
        }
}


class Passageiro extends Pessoa{


        public Passageiro(int id, String nome){
                super(id, nome);
                this.acento = null;
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


enum Status{
        SUBINDO,
        DESCENDO
}

class Aviao{
        
        private Pessoa[] lugares;
        private Status status;
        
        public Aviao(){
                this.lugares = new Pessoa[250];
                this.status = Status.SUBINDO;
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
        
        public void mudaStatus(){
                
                if(this.status == Status.SUBINDO){
                        this.status = Status.DESCENDO;
                        
                } else {
                        this.status = Status.SUBINDO;
                }
                
                System.out.printf("o avião está %s%n", this.status);
                
        }
        
}
