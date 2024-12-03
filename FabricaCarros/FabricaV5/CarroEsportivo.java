public class CarroEsportivo extends CarroBase {
    private double velocidadeMaxima;
    private boolean modoEsportivo;

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isModoEsportivo() {
        return modoEsportivo;
    }

    public void ativarModoEsportivo() {
        this.modoEsportivo = true;
        System.out.println("Modo esportivo ativado!");
    }

    public void desativarModoEsportivo() {
        this.modoEsportivo = false;
        System.out.println("Modo esportivo desativado!");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Potência do Motor: " + getPotenciaMotor() + " CV");
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Modo Esportivo: " + (modoEsportivo ? "Ativado" : "Desativado"));
    }
}
