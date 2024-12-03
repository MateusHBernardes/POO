public abstract class CarroBase {
    private int anoFabricacao;
    private double potenciaMotor;

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    // Método abstrato que pode ser implementado pelas classes filhas
    public abstract void exibirDetalhes();
}
