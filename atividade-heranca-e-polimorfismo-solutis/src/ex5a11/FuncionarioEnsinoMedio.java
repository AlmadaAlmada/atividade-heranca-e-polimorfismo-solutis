package ex5a11;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
    }

    @Override
    public double calcularRenda() {

        return super.calcularRenda() * 1.50;
    }
}
