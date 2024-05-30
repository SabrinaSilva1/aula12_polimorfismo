public class Jolteon extends Eevee {

    public Jolteon (String nome, String tipo, double altura, double HP, double peso) {
        super(nome, tipo, altura, HP, peso);
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
