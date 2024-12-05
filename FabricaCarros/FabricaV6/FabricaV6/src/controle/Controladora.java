package controle;
import modelo.Carro;
import modelo.CarroEsportivo;
import visualizacao.EntradaSaida;

public class Controladora {
        // Solicitando dados do usuário

        // Criando o carro e configurando os atributos
        

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
}
