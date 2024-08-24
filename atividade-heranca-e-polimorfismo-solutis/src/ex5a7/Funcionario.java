package ex5a7;

public class Funcionario {
    private String nome;
    private int codigoFuncional;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public double calcularRenda() {
        return 1000.00;
    }
}

