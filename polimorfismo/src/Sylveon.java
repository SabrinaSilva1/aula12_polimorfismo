public class Sylveon extends Eevee {

    public Sylveon (String tipo, double altura, double HP, double peso) {
        super(tipo, altura, HP, peso);
    }
    
    @Override
    public String ataque(){
        return "Charme";
    }

    @Override
    public String defesa(){
        return "Brilho Deslumbrante";
    }

    @Override
    public String especial(){
        return "Explosão Lunar";
    }
}
