package ex5a7;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
    }

    @Override
    public double calcularRenda() {

        return super.calcularRenda() * 1.50;
    }
}
