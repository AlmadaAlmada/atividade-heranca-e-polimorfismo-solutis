package ex5a11;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escola, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00;
    }
}
