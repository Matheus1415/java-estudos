package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Aves a = new Aves();
        //Animais
        Canguru c =new Canguru();
        Tartaruga t = new Tartaruga();
        Cachorro k = new Cachorro();
        Arara ar = new Arara();
        GoldFisth g = new GoldFisth();
        
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        //LOCOMOÇÃO
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        
        
    }//fecha psvm
}//fecha classe
