public class Glaceon extends Eevee {

    public Glaceon (String nome, String tipo, double altura, double HP, double peso) {
        super(nome, tipo, altura, HP, peso);
    }

    @Override
    public String ataque(){
        return "Pedaço de gelo";
    }

    @Override
    public String defesa(){
        return "Avalanche";
    }

    @Override
    public String especial(){
        return "Respiração Gélida";
    }
}
