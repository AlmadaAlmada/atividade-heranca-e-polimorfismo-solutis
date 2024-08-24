package ex5a11;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
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

    public double calcularRenda() {
        double rendaBase = 1000.00;
        if (comissao != null) {
            rendaBase += comissao.getValorComissao();
        }
        return rendaBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: R$ " + (comissao != null ? comissao.getValorComissao() : 0.00) +
                ", Salário Total: R$ " + calcularRenda();
    }
}


