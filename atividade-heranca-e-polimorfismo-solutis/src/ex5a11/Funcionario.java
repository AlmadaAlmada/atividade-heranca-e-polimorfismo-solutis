package ex5a11;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public double calcularRendaBase() {
        double rendaBase = 1000.00;
        return rendaBase;
    }

    public double calcularRendaComissao() {
        double rendaComissao = calcularRendaBase();
        rendaComissao += comissao.getValorComissao();
        return rendaComissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salario base: R$ " + calcularRendaBase() + ", Comissão: R$ " +
                (comissao != null ? comissao.getValorComissao() : 0.00) + ", Salário Total: R$ " + calcularRendaComissao();
    }
}


