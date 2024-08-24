package ex5a11;

// Classe Vendedor com comissão específica
public class Vendedor implements Comissao {
    @Override
    public double getValorComissao() {
        return 250.00;
    }
}
