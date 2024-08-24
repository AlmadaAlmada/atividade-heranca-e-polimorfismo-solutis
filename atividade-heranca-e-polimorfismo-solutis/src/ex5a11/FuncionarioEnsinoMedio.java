package ex5a11;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
    }

    @Override
    public double calcularRendaBase() {

        return super.calcularRendaBase() * 1.50;
    }

    @Override
    public double calcularRendaComissao() {
        return super.calcularRendaComissao();
    }
}
