public class Floreon extends Eevee {

    public Floreon (String tipo, double altura, double HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque(){
        return "Humano";
    }

    @Override
    public String defesa(){
        return "Giro de fogo";
    }

    @Override
    public String especial(){
        return "Super aquecimento";
    }
}
