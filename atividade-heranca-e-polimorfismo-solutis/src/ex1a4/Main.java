package ex1a4;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", "cachorro", 5);
        Animal cavalo = new Cavalo("Spirit", "cavalo", 8);
        Animal preguica = new Preguica("Sid", "preguiça", 3);
        Animal cachorro2 = new Cachorro("Bolt","cachorro", 4);
        Animal cavalo2 = new Cavalo("Trovão","cavalo", 7);
        Animal preguica2 = new Preguica("Flash","preguiça", 2);
        Animal cachorro3 = new Cachorro("Max","cachorro", 6);
        Animal cavalo3 = new Cavalo("Raio","cavalo", 5);
        Animal preguica3 = new Preguica("Molly","preguiça", 4);
        Animal cachorro4 = new Cachorro("Buddy","cachorro", 3);

        //Consultar 3 animais no veterinário
         Veterinario veterinario = new Veterinario();
         System.out.println("Consultando três animais:");
         veterinario.examinar(cachorro);
         veterinario.examinar(preguica);
         veterinario.examinar(cavalo);


        // Criando o zoológico
        Zoologico zoologico = new Zoologico();
        System.out.println( );
        System.out.println("Passeando pelas jaulas:");
        zoologico.adicionarAnimal(0, cachorro);
        zoologico.adicionarAnimal(1, cavalo);
        zoologico.adicionarAnimal(2, preguica);
        zoologico.adicionarAnimal(3, cachorro2);
        zoologico.adicionarAnimal(4, cavalo2);
        zoologico.adicionarAnimal(5, preguica2);
        zoologico.adicionarAnimal(6, cachorro3);
        zoologico.adicionarAnimal(7, cavalo3);
        zoologico.adicionarAnimal(8, preguica3);
        zoologico.adicionarAnimal(9, cachorro4);

        zoologico.percorrerJaulas();
    }
}



