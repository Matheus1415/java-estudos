package ultraEmojiCombat;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, enpates;
    //METODOS PUBLICOS
    public void apresentar(){
        System.out.println("____________________________________________");
        System.out.println("CHEGOU A HOTA! apresentamos o "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+" idade e "+this.altura+" altura");
        System.out.println("pesando "+this.getPeso()+"KG");
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEnpates()+" Empates");
    }//apresentar
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
        System.out.println("Empatou "+this.getEnpates()+" vezes");
    }//statu
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }//vitoria
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }//derrota
    public void empatarLuta(){
        this.setEnpates(this.getEnpates()+1);
    }//enpate
   //METODOS ESPECIAIS

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int en ) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.enpates = en;
    }//fecha construtor
    
    //GET e SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2 ){
            this.categoria = "Invalido";
        }else if(this.peso <=70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9 ){
            this.categoria ="Peso Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Peso P esado";
        }else {
            this.categoria = "Invalido";
            
        }
    }//fecha setCategoria

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEnpates() {
        return enpates;
    }

    public void setEnpates(int enpates) {
        this.enpates = enpates;
    }
    
    
    
}//fecha classse lutador
