public class Eevee {
    private String nome;
    private String tipo;
    private double altura, HP;
    private double peso;

    public Eevee (String nome, String tipo, double altura, double HP, double peso){
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }
    public String ataque(){
        return "Ataque rápido";
    }

    public String defesa(){
        return "Desvio";
    }

    public String especial(){
        return "Tri-ataque";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimir(){
        System.out.println("Eu sou " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Altura: " + getAltura());
        System.out.println("HP: " + getHP());
        System.out.println("Peso: " + getPeso());
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: "+ defesa());
        System.out.println("Especial: "+ especial());
        System.out.println();
    }
    
}
