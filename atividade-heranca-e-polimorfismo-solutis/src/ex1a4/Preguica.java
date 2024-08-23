package ex1a4;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("gritar");
    }

    public void escalar() {
        System.out.println("A preguiça está escalando lentamente");
    }
}

