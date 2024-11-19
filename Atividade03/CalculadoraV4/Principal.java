 import javax.swing.JOptionPane;
public class Principal {
    private static Operacoes oper = new Operacoes();

    public static void main(String[] args) {
        int continuar;
        double resultado=0;
        do {
            double num1 = EntradaSaida.solicitaNumero("1º");
            double num2 = EntradaSaida.solicitaNumero("2º");
            int operacao = EntradaSaida.solicitaOperacao();
        
            switch(operacao) {
                case 1:
                Soma soma = new Soma();
                resultado = soma.calculaSoma();
                break;

                case 2:
                Subtracao sub = new Subtracao();
                resultado = sub.calculaSubtracao();
                break;

                case 3:
                Multiplicacao multi = new Multiplicacao();
                resultado = multi.calculaMultiplicacao();
                break;

                case 4:
                while (num2 == 0) {
                    num2=EntradaSaida.solicitaNumero("2º");
                }
                Divisao divi = new Divisao();
                resultado = divi.calculaDivisao();
                break;
            }

            EntradaSaida.mostraResultado(resultado, operacao);
            continuar=Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Não"));
        } while(continuar==1);
    }
}

/*          switch(operacao){
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
                    num2=EntradaSaida.solicitaNumero("2º");
                }
                resultado=oper.calculaDivisao(num1, num2);
                break;
                default:
                JOptionPane.showMessageDialog(null, "Operação Inválida");
                System.exit(0);
            } */