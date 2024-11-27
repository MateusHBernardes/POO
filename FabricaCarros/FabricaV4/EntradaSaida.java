import javax.swing.JOptionPane;

public class EntradaSaida {
    
    public static String solicitarModelo() {
            String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: \n1. Modelo 1\n2. Modelo 2\n3. Modelo 3");
            return modelo;
        }

        public static String solicitarCor() {
            String cor = JOptionPane.showInputDialog("Informe a cor do carro: \n1. Preto\n2. Prata\n3. Branco");
            return cor;
        }

}
