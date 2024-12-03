import javax.swing.JOptionPane;

public class EntradaSaida {

    public static String solicitarModelo() {
        return JOptionPane.showInputDialog("Informe o modelo do carro:");
    }

    public static String solicitarCor() {
        return JOptionPane.showInputDialog("Informe a cor do carro:");
    }

    public static int solicitarAnoFabricacao() {
        String input = JOptionPane.showInputDialog("Informe o ano de fabricação do carro:");
        return Integer.parseInt(input); // Converte o input para inteiro
    }

    public static double solicitarPotenciaMotor() {
        String input = JOptionPane.showInputDialog("Informe a potência do motor (em CV):");
        return Double.parseDouble(input); // Converte o input para double
    }

    public static void exibirDetalhes(String modelo, String cor, int ano, double potencia) {
        
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo + "\n Cor: " + cor + "\n Ano de Fabricação: " + ano + "\n Potência do Motor: " + potencia + " CV");
    }
}
