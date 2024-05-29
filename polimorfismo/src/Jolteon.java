public class Jolteon extends Eevee {

    public Jolteon (String tipo, double altura, double HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque(){
        return "Trovoada - Thunder-Shock";
    }

    @Override
    public String defesa(){
        return "Larga - Wild Charge";
    }

    @Override
    public String especial(){
        return "Raio - Thunder";
    }
}
