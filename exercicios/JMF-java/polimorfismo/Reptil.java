package aula12;
 public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vejetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som e reptiu");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}//fim da classe
