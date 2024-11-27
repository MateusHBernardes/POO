import javax.swing.JOptionPane;

public class EntradaSaida {

    private static Operacoes oper = new Operacoes();

    public static void main(String[] args) {

        int continuar;
        double resultado = 0;

        do {
            double num1 = solicitaNumero("1°");
            double num2 = solicitaNumero("2°");
            int operacao = solicitaOperacao();

            switch (operacao) {
                case 1:
                    resultado = oper.calculaSoma(num1, num2);
                    break;
                case 2:
                    resultado = oper.calculaSubtracao(num1, num2);
                    break;
                case 3:
                    resultado = oper.calculaMultiplicacao(num1, num2);
                    break;
                case 4:
                    while (num2 == 0) {
                        num2 = solicitaNumero("2° (não pode ser zero para divisão)");
                    }
                    resultado = oper.calculaDivisao(num1, num2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada.");
                    System.exit(0);
            }

            mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Não"));

        } while (continuar == 1);
    }

    public static class Operacoes {
        public double calculaSoma(double num1, double num2) {
            return num1 + num2;
        }

        public double calculaSubtracao(double num1, double num2) {
            return num1 - num2;
        }

        public double calculaMultiplicacao(double num1, double num2) {
            return num1 * num2;
        }

        public double calculaDivisao(double num1, double num2) {
            return num1 / num2;
        }
    }

    public static int solicitaOperacao() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada: \n"
                + "1 - Soma\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão"));
    }

    public static double solicitaNumero(String ordem) {
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
    }

    public static void mostraResultado(double resultado, int operacao) {
        String op = switch (operacao) {
            case 1 -> "Soma";
            case 2 -> "Subtração";
            case 3 -> "Multiplicação";
            case 4 -> "Divisão";
            default -> "Operação Desconhecida";
        };
        JOptionPane.showMessageDialog(null, "O resultado da " + op + " é: " + resultado);
    }
}
