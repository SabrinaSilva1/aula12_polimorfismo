public class Vaporeon extends Eevee {

    public Vaporeon(String nome, String tipo, double altura, double HP, double peso) {
        super(nome, tipo, altura, HP, peso);
    }

    @Override
    public String ataque(){
        return "Arma de água";
    }

    @Override
    public String defesa(){
        return "Cauda Aqua";
    }

    @Override
    public String especial(){
        return "Bomba Hidro";
    }

    
}
