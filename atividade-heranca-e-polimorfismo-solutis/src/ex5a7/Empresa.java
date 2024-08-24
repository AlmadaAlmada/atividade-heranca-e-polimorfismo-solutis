package ex5a7;

public class Empresa {
    public static void main(String[] args) {

        Funcionario funcionarioSemEscolaridade = new Funcionario("FUNCIONARIO MODELO", 111);
        Funcionario funcionarioComEnsinoBasico = new FuncionarioEnsinoBasico("FUNCIONARIO MODELO", 222, "Escola MODELO");
        Funcionario funcionarioComEnsinoMedio = new FuncionarioEnsinoMedio("FUNCIONARIO MODELO", 333, "Escola MODELO");
        Funcionario funcionarioComGraduacao = new FuncionarioGraduado("FUNCIONARIO MODELO", 444, "Escola MODELO", "Universidade MODELO");

        Funcionario[] funcionarios = new Funcionario[10];

        // Distribuindo 40% com ensino básico, 40% com ensino médio, e 20% com graduação
        funcionarios[0] = new FuncionarioEnsinoBasico("Carlos", 1, "Escola A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Ana", 2, "Escola B");
        funcionarios[2] = new FuncionarioEnsinoMedio("Pedro", 3, "Escola C");
        funcionarios[3] = new FuncionarioEnsinoMedio("Maria", 4, "Escola D");
        funcionarios[4] = new FuncionarioEnsinoBasico("João", 5, "Escola E");
        funcionarios[5] = new FuncionarioEnsinoMedio("Lucas", 6, "Escola F");
        funcionarios[6] = new FuncionarioEnsinoMedio("Fernanda", 7, "Escola G");
        funcionarios[7] = new FuncionarioGraduado("Roberta", 8, "Escola H", "Universidade Tecnológica Federal do Paraná");
        funcionarios[8] = new FuncionarioGraduado("Felipe", 9, "Escola I", "Universidade Tecnológica Federal do Paraná");
        funcionarios[9] = new FuncionarioEnsinoBasico("Bruna", 10, "Escola J");

        double totalSalarios = 0;
        double totalEnsinoBasico = 0;
        double totalEnsinoMedio = 0;
        double totalGraduacao = 0;

        for (Funcionario f : funcionarios) {
            double salario = f.calcularRenda();
            totalSalarios += salario;

            if (f instanceof FuncionarioGraduado) {
                totalGraduacao += salario;
            } else if (f instanceof FuncionarioEnsinoMedio) {
                totalEnsinoMedio += salario;
            } else if (f instanceof FuncionarioEnsinoBasico) {
                totalEnsinoBasico += salario;
            }
        }
        System.out.println("Custo com um funcionário sem escolaridade: " + funcionarioSemEscolaridade.calcularRenda());
        System.out.println("Custo com um funcionário com ensino básico: " + funcionarioComEnsinoBasico.calcularRenda());
        System.out.println("Custo com um funcionário com ensino médio: " + funcionarioComEnsinoMedio.calcularRenda());
        System.out.println("Custo com um funcionário graduado: " + funcionarioComGraduacao.calcularRenda());
        System.out.println("Custo total com salários: R$ " + totalSalarios);
        System.out.println("Custo com funcionários de ensino básico: R$ " + totalEnsinoBasico);
        System.out.println("Custo com funcionários de ensino médio: R$ " + totalEnsinoMedio);
        System.out.println("Custo com funcionários graduados: R$ " + totalGraduacao);
    }
}

