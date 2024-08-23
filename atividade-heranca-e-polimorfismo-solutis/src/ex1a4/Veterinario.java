package ex1a4;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.print("O " +animal.getTipo() +" conhecido pelo nome "+ animal.getNome() + ", durante a consulta com o veterinário emite o som: ");
        animal.emitirSom();

    }
}





