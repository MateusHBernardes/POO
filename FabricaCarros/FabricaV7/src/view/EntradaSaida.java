
package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int solicitaOpcao() {
        // Definindo as opções do menu
        String[] opcoes = {"Construir Carro", "Listar Carros", "Sair do Programa"};
        
        // Criando o JComboBox com as opções
        JComboBox<String> menu = new JComboBox<>(opcoes);
        
        // Exibindo o menu dentro de um JOptionPane
        int resultado = JOptionPane.showConfirmDialog(
                null,
                menu,
                "Selecione a opção desejada",
                JOptionPane.OK_CANCEL_OPTION
        );

        // Verifica se o usuário clicou em "OK" ou "Cancelar"
        if (resultado == JOptionPane.OK_OPTION) {
            return menu.getSelectedIndex(); // Retorna o índice da opção selecionada
        } else {
            return -1; // Retorna -1 caso o usuário cancele a seleção
        }
    }

    public static void exibeMsgEncerraPrograma() {
        JOptionPane.showMessageDialog(null, "O programa será encerrado!");
    }
}

/* 
package view;
import javax.swing.JOptionPane;
public class EntradaSaida {

    public static int solicitaOpcao() {
        String[] opcoes = {"Construir carro", "Listar carros", "Sair do programa"};
        JComboBox <String> menu = new JComboBox <String> (opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada",
                JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }

    public static void exibeMsgEncerraPrograma() {
        JOptionPane.showMessageDialog(null,"O programa será encerrado!");
    } 

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
*/