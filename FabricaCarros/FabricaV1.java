import javax.swing.JOptionPane;

public class FabricaV1 {
    
    public static void main(String[] args) {
        
        int modelo;
        int cor;

        class principal{
            
            int modelo;
            int cor;
        }

        public int getModelo() {
            return modelo;
        }
    
        public int getCor() {
            return cor;
        }
        
    }

    public class solicitarDados {
        public static int solicitarModelo() {
            int modelo = Integer.parseInt(JOptionPane.showInputDialog("Informe o modelo do carro: \nModelo 1\nModelo 2\nModelo 3"));
        }

        public static int solicitarCor() {
            int cor = Integer.parseInt(JOptionPane.showInputDialog("Informe a cor do carro: \nPreto\nPrata 2\nBranco"));
        }
    }

}
