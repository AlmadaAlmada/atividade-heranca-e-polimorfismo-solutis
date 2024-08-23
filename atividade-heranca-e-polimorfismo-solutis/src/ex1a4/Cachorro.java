package ex1a4;

public class Cachorro extends Animal {

    public Cachorro(String nome,String tipo, int idade) {
        super(nome, tipo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }

    public void correr() {
        System.out.println("O cachorro está correndo");
    }
}

