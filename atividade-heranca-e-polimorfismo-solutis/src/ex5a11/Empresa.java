package ex5a11;

public class Empresa {
    public static void main(String[] args) {

        Funcionario funcionarioSemEscolaridade = new Funcionario("FUNCIONARIO MODELO", 111, new semComissao());
        Funcionario funcionarioComEnsinoBasico = new FuncionarioEnsinoBasico("FUNCIONARIO MODELO", 222, "Escola MODELO", new semComissao());
        Funcionario funcionarioComEnsinoMedio = new FuncionarioEnsinoMedio("FUNCIONARIO MODELO", 333, "Escola MODELO", new semComissao());
        Funcionario funcionarioComGraduacao = new FuncionarioGraduado("FUNCIONARIO MODELO", 444, "Escola MODELO", "Universidade MODELO", new semComissao());

        Funcionario[] funcionarios = new Funcionario[10];

        // Distribuindo 40% com ensino básico, 40% com ensino médio, e 20% com graduação
        funcionarios[0] = new FuncionarioEnsinoBasico("Carlos", 1, "Escola A", new Gerente());
        funcionarios[1] = new FuncionarioEnsinoBasico("Ana", 2, "Escola B", new Supervisor());
        funcionarios[2] = new FuncionarioEnsinoMedio("Pedro", 3, "Escola C", new Supervisor());
        funcionarios[3] = new FuncionarioEnsinoMedio("Maria", 4, "Escola D", new Vendedor());
        funcionarios[4] = new FuncionarioEnsinoBasico("João", 5, "Escola E", new Vendedor());
        funcionarios[5] = new FuncionarioEnsinoMedio("Lucas", 6, "Escola F", new Vendedor());
        funcionarios[6] = new FuncionarioEnsinoMedio("Fernanda", 7, "Escola G", new Vendedor());
        funcionarios[7] = new FuncionarioGraduado("Roberta", 8, "Escola H", "Universidade Tecnológica Federal do Paraná", new Vendedor());
        funcionarios[8] = new FuncionarioGraduado("Felipe", 9, "Escola I", "Universidade Tecnológica Federal do Paraná", new Vendedor());
        funcionarios[9] = new FuncionarioEnsinoBasico("Bruna", 10, "Escola J", new Vendedor());

        double totalSalarios = 0;
        double totalEnsinoBasico = 0;
        double totalEnsinoMedio = 0;
        double totalGraduacao = 0;

        double totalSalariosComissoes = 0;
        double totalGerentes = 0;
        double totalSupervisores = 0;
        double totalVendedores = 0;

        for (Funcionario f : funcionarios) {
            double salario = f.calcularRendaBase();
            totalSalarios += salario;

            if (f instanceof FuncionarioGraduado) {
                totalGraduacao += salario;
            } else if (f instanceof FuncionarioEnsinoMedio) {
                totalEnsinoMedio += salario;
            } else if (f instanceof FuncionarioEnsinoBasico) {
                totalEnsinoBasico += salario;
            }

            double salarioComissao = f.calcularRendaComissao();
            totalSalariosComissoes += salarioComissao;

            if (f.getComissao() instanceof Gerente) {
                totalGerentes += salarioComissao;
            } else if (f.getComissao() instanceof Supervisor) {
                totalSupervisores += salarioComissao;
            } else if (f.getComissao() instanceof Vendedor) {
                totalVendedores += salarioComissao;
            }
        }

        System.out.println("Custo com um funcionário sem escolaridade, sem comissão: " + funcionarioSemEscolaridade.calcularRendaComissao());
        System.out.println("Custo com um funcionário com ensino básico, sem comisssão: " + funcionarioComEnsinoBasico.calcularRendaComissao());
        System.out.println("Custo com um funcionário com ensino médio, sem comissão: " + funcionarioComEnsinoMedio.calcularRendaComissao());
        System.out.println("Custo com um funcionário graduado, sem comissão: " + funcionarioComGraduacao.calcularRendaComissao());
        System.out.println();
        System.out.println("Custo com os funcionários de ensino básico sem comissão da empresa: R$ " + totalEnsinoBasico);
        System.out.println("Custo com os funcionários de ensino médio sem comissão da empressa: R$ " + totalEnsinoMedio);
        System.out.println("Custo com os funcionários graduados sem comissão da empresa: R$ " + totalGraduacao);
        System.out.println("Custo total com salários sem comissão: R$ " + totalSalarios);
        System.out.println();
        System.out.println("Custo com os gerentes da empresa: R$ " + totalGerentes);
        System.out.println("Custo com os supervisores da empresa: R$ " + totalSupervisores);
        System.out.println("Custo com os vendedores da empresa: R$ " + totalVendedores);
        System.out.println("Custo total dos salários com comissões da empresa: R$ " + totalSalariosComissoes);
        System.out.println();
        System.out.println();

        System.out.println("funcionários da empresa:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}

