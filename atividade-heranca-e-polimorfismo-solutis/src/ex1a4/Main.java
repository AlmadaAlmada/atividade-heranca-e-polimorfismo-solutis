package ex1a4;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 8);
        Animal preguica = new Preguica("Sid", 3);
        Animal cachorro2 = new Cachorro("Bolt", 4);
        Animal cavalo2 = new Cavalo("Trovão", 7);
        Animal preguica2 = new Preguica("Flash", 2);
        Animal cachorro3 = new Cachorro("Max", 6);
        Animal cavalo3 = new Cavalo("Raio", 5);
        Animal preguica3 = new Preguica("Molly", 4);
        Animal cachorro4 = new Cachorro("Buddy", 3);

        // Criando o zoológico
        Zoologico zoologico = new Zoologico();

        // Adicionando os animais às jaulas
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

        // Percorrendo as jaulas e executando os comportamentos
        zoologico.percorrerJaulas();
    }
}



