import javax.swing.JOptionPane;

public class FabricaV1 {
    
    public static void main(String[] args) {
        
        SolicitarDados dados = new SolicitarDados();
        
        int modelo = dados.solicitarModelo();
        int cor = dados.solicitarCor();
        
        Veiculo veiculo = new Veiculo(modelo, cor);

        JOptionPane.showMessageDialog(null, 
            "Você selecionou o Modelo: " + veiculo.getModelo() +
            " e Cor: " + veiculo.getCor());
    }
    
    static class Veiculo {
        private int modelo;
        private int cor;
        
        public Veiculo(int modelo, int cor) {
            this.modelo = modelo;
            this.cor = cor;
        }
        
        public int getModelo() {
            return modelo;
        }
        
        public int getCor() {
            return cor;
        }
    }

    public static class SolicitarDados {
        public int solicitarModelo() {
            int modelo = Integer.parseInt(JOptionPane.showInputDialog("Informe o modelo do carro: \n1. Modelo 1\n2. Modelo 2\n3. Modelo 3"));
            return modelo;
        }

        public int solicitarCor() {
            int cor = Integer.parseInt(JOptionPane.showInputDialog("Informe a cor do carro: \n1. Preto\n2. Prata\n3. Branco"));
            return cor;
        }
    }
}
