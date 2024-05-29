public class Umbreon extends Eevee {

    public Umbreon (String tipo, double altura, double HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque(){
        return "Rosnar";
    }

    @Override
    public String defesa(){
        return "Jogo sujo";
    }

    @Override
    public String especial(){
        return "Pulso negro";
    }
}
