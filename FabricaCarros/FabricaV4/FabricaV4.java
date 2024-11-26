
import javax.swing.JOptionPane;

public class FabricaV4 implements Interface {

    public static void main(String[] args) {

        SolicitarDados dados = new SolicitarDados();

        int modelo = dados.solicitarModelo();
        int cor = dados.solicitarCor();

        Carro veiculo = new Carro();
        veiculo.setModelo(modelo);
        veiculo.setCor(cor);

        JOptionPane.showMessageDialog(null,
                "Você selecionou o Modelo: " + veiculo.getModelo()
                + " e Cor: " + veiculo.getCor());
    }

    public static class SolicitarDados {

        public static int solicitarModelo() {
            int modelo = Integer.parseInt(JOptionPane.showInputDialog("Informe o modelo do carro: \n1. Modelo 1\n2. Modelo 2\n3. Modelo 3"));
            return modelo;
        }

        public static int solicitarCor() {
            int cor = Integer.parseInt(JOptionPane.showInputDialog("Informe a cor do carro: \n1. Preto\n2. Prata\n3. Branco"));
            return cor;
        }
    }

}
