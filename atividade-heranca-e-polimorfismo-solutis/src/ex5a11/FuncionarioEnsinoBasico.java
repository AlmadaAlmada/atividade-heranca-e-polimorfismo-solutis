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
    public double calcularRendaBase() {
        return super.calcularRendaBase() * 1.10;
    }

    public double calcularRendaComissao() {
        return super.calcularRendaComissao();
    }
}
