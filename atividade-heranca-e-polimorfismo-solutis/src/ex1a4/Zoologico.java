package ex1a4;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice inválido para a jaula.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.println("Jaula " + (i + 1) + ", "+ animal.getNome() +":");
                animal.emitirSom();

                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    if (animal instanceof Cachorro) {
                        ((Cachorro) animal).correr();
                    } else if (animal instanceof Cavalo) {
                        ((Cavalo) animal).correr();
                    }
                }
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
            }
            System.out.println();
        }
    }
}

