public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee eevee = new Eevee("Eevee","Fogo", 0.3, 55, 6.5);
        Jolteon jolteon = new Jolteon("Jolteon","Elétrico", 0.8, 65, 24.5);
        Espeon espeon = new Espeon("Espeon","Psíquico", 0.9, 65, 26.5);
        Floreon floreon = new Floreon("Floreon","Fogo", 0.9, 65, 25.0);
        Glaceon glaceon = new Glaceon("Glaceon","Gelo", 0.8, 65, 25.9);
        Leafeon leafeon = new Leafeon("Leafeon","Grama", 1.0, 65, 25.5);
        Sylveon sylveon = new Sylveon("Sylveon","Fada", 1.0, 95, 23.5);
        Umbreon umbreon = new Umbreon("Umbreon","Escuro", 1.0, 95, 27.0);
        Vaporeon vaporeon = new Vaporeon("Vaporeon","Água", 1.0, 130, 29.0);

        eevee.imprimir();
        jolteon.imprimir();
        espeon.imprimir();
        floreon.imprimir();
        glaceon.imprimir();
        leafeon.imprimir();
        sylveon.imprimir();
        umbreon.imprimir();
        vaporeon.imprimir();


    }
}
