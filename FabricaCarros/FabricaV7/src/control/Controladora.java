
package control;

import view.EntradaSaida;

public class Controladora {
    public void exibeMenu() {
        int opcao;
        do {
            opcao = EntradaSaida.solicitaOpcao();

            switch (opcao) {
                case 0: // Construir Carro
                    construirCarro();
                    break;

                case 1: // Listar Carros
                    listarCarros();
                    break;

                case 2: // Sair
                    EntradaSaida.exibeMsgEncerraPrograma();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Operação cancelada ou inválida.");
            }
        } while (opcao != 2); // Sai do loop ao selecionar "Sair"
    }

    private void construirCarro() {
        // Lógica para criar e configurar o carro
        System.out.println("Construindo carro...");
    }

    private void listarCarros() {
        // Lógica para listar os carros criados
        System.out.println("Listando carros...");
    }
}


/*

package control;
import javax.swing.JOptionPane;
import model.*;
import view.EntradaSaida;

public class Controladora {

        // Solicitando dados do usuário

        // Criando o carro e configurando os atributos

        private Carro carroControl = null;

    public void exibeMenu() {
        int opcao;
        do {
            opcao = EntradaSaida.solicitaOpcao();

            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Teste");
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "Teste1");
                break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Teste2");
                break;
            }
        } while(opcao !=3);

        EntradaSaida.exibeMsgEncerraPrograma();

        System.exit(0);
    }
        

    public void exibeMenu() {
        Carro carro = new Carro();

        String modelo = EntradaSaida.solicitarModelo();
        String cor = EntradaSaida.solicitarCor();
        int ano = EntradaSaida.solicitarAnoFabricacao();
        double potencia = EntradaSaida.solicitarPotenciaMotor();

        carro.setModelo(modelo);
        carro.setCor(cor);
        carro.setAnoFabricacao(ano);
        carro.setPotenciaMotor(potencia);

        // Exibindo os detalhes do carro
        EntradaSaida.exibirDetalhes(
                carro.getModelo(),
                carro.getCor(),
                carro.getAnoFabricacao(),
                carro.getPotenciaMotor()
        );

        CarroEsportivo esportivo = new CarroEsportivo();

        String modelo1 = EntradaSaida.solicitarModelo();
        String cor1 = EntradaSaida.solicitarCor();
        int ano1 = EntradaSaida.solicitarAnoFabricacao();
        double potencia1 = EntradaSaida.solicitarPotenciaMotor();

        esportivo.setModelo(modelo1);
        esportivo.setCor(cor1);
        esportivo.setAnoFabricacao(ano1);
        esportivo.setPotenciaMotor(potencia1);
        esportivo.setVelocidadeMaxima(300);
        System.out.println(esportivo.getModelo());
        System.out.println(esportivo.getCor());
        System.out.println(esportivo.getAnoFabricacao());
        System.out.println(esportivo.getPotenciaMotor());

    } 
} */
