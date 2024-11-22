
import javax.swing.JOptionPane;

public class Calculadora2 {

    public static void main(String[] args) {

        int continuar;
        double resultado = 0;

        do {
            double num1 = Calculadora2.solicitaNumero("1°");
            double num2 = Calculadora2.solicitaNumero("2°");
            int operacao = Calculadora2.solicitaOperacao();

            switch (operacao) {
                case 1:
                    resultado = calculaSoma(num1, num2);
                    break;
                case 2:
                    resultado = calculaSubtracao(num1, num2);
                    break;
                case 3:
                    resultado = calculaMultiplicacao(num1, num2);
                    break;
                case 4:
                    while (num2 == 0) {
                        num2 = Calculadora2.solicitaNumero("2°");
                    }
                    resultado = calculaDivisao(num1, num2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será  encerrada.");
                    System.exit(0);
            }

            Calculadora2.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Não"));

        } while (continuar == 1);
    }

    public static int solicitaOperacao() {

        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada: \n"
                + "1 - Soma\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão"));
        return operacao;
    }

    public static double solicitaNumero(String ordem) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
        return num;
    }

    public static void mostraResultado(double resultado, int operacao) {
        String op = "";

        if (operacao == 1) {
            op = "Soma";
        } else if (operacao == 2) {
            op = "Subtração";
        } else if (operacao == 3) {
            op = "Multiplicação";
        } else if (operacao == 4) {
            op = "Divisão";
        }
        JOptionPane.showMessageDialog(null, "O resultado da " + op + " é: " + resultado);

    }
    static int solicitarOperacao() {

        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções desejadas: \n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão"));
        return operacao;
    }

    static double solicitarNumero(String ordem) {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
        return num;
    }

    static double calculaSoma(double num1, double num2) {
        double soma = num1 + num2;
        return soma;
    }

    static double calculaSubtracao(double num1, double num2) {
        double sub = num1 - num2;
        return sub;
    }

    static double calculaMultiplicacao(double num1, double num2) {
        double mult = num1 * num2;
        return mult;
    }

    static double calculaDivisao(double num1, double num2) {
        double div = num1 / num2;
        return div;
    }
}