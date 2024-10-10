
import javax.swing.JOptionPane;


public class calculadora {
    public static void main(String[] args) {
        
        int continuar;

        do { 
            double num1 = solicitarNumero("1º");   
            double num2 = solicitarNumero("2º");   
            int operacao =  solicitarOperacao;
        
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Não"));
        } while(continuar == 1);
    }

    static int solicitarOperacao() {

        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções desejadas: \n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão"));
        return operacao;
    }

    static double solicitarNumero(String ordem) {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ordem+" número"));
        return num;
    }
}