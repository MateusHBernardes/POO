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
        String mensagem = String.format(
            "Modelo: %s\nCor: %s\nAno de Fabricação: %d\nPotência do Motor: %.2f CV",
            modelo, cor, ano, potencia
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
