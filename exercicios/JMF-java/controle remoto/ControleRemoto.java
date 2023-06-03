package exercicio;
public class ControleRemoto implements Ecercicio1{
    //ATRIBUTOS
        private int volume;
        private boolean ligado;
        private boolean tocando;
        //METODOS ESPECIAIS

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando =false;
    }//classe construtor

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //METODOS OBSTRATOS

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abriMenu() {
        System.out.println("Estar ligado ?" + this.getLigado());
        System.out.println("Estar tocando ?" + this.getTocando());
        System.out.print("Volume" + this.getVolume());
        for( int i=0; i <= this.getVolume(); i+=10 );
        System.out.println("[]");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado( )){
                this.setVolume(this.getVolume()+1);
        }//fecha if
    }//fecha mais volume

    @Override
    public void menosVolume() {
        if(getLigado()){
            this.setVolume(getVolume()-5);
        }//fecha if
        
        else{ System.out.println("Impossivel pois estar desligado");}//fecha else
    }//fecha menos volume

    @Override
    public void ligarMudo() {
        if(this.getLigado() &&  this.getVolume() > 0){
            this.setVolume(0);
        }//fecha if
    }//fecha ligar mudo

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }//fecha id
    }//fecha desligar mudo

    @Override
    public void play() {
        if(this.getLigado()&&!(this.getTocando())){
            this.setTocando(true);
        }//fecha if
    }// fecha play

    @Override
    public void pausa() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false );
        }//fecha if
    }//Fecha pause
    
    
    
}//clase controle remoto
