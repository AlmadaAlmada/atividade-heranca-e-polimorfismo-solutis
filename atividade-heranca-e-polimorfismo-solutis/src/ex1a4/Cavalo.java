package ex1a4;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("relinchar");
    }

    public void correr() {
        System.out.println("O cavalo está cavalgando");
    }
}

