public class FabricaDeCarros {

    public static void main(String[] args) {
        // Solicitando dados do usuário
        String modelo = EntradaSaida.solicitarModelo();
        String cor = EntradaSaida.solicitarCor();
        int ano = EntradaSaida.solicitarAnoFabricacao();
        double potencia = EntradaSaida.solicitarPotenciaMotor();

        // Criando o carro e configurando os atributos
        Carro carro = new Carro();
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
    }
}
