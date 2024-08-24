package ex5a11;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escola;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.10;
    }
}
