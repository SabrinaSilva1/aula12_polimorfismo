public class Espeon extends Eevee {

    public Espeon (String tipo, double altura, double HP, double peso) {
        super(tipo, altura, HP, peso);
    }
    @Override
    public String ataque(){
        return "Cabeça de Vento";
    }

    @Override
    public String defesa(){
        return "Confusão";
    }

    @Override
    public String especial(){
        return "Bola Sombria";
    
    }

}