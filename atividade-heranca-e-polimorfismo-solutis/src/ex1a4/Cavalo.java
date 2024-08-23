package ex1a4;

public class Cavalo extends Animal {

    public Cavalo(String nome,String tipo, int idade) {
        super(nome, tipo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("relinchar");
    }

    public void correr() {
        System.out.println("O cavalo está cavalgando");
    }
}

