public class Leafeon extends Eevee {

    public Leafeon (String nome, String tipo, double altura, double HP, double peso) {
        super(nome, tipo, altura, HP, peso);
    }

    @Override
    public String ataque(){
        return "Folha Navalha";
    }

    @Override
    public String defesa(){
        return "Raio Solar";
    }

    @Override
    public String especial(){
        return "Lâmina Folha";
    }
}
