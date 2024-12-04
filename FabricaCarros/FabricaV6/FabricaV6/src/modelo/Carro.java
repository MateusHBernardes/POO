package modelo;
import javax.swing.JOptionPane;

public class Carro extends CarroBase {

    private String modelo;
    private String cor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //@Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo);
        JOptionPane.showMessageDialog(null, "Cor: " + cor);
        JOptionPane.showMessageDialog(null, "Ano de Fabricação: " + getAnoFabricacao());
        JOptionPane.showMessageDialog(null, "Potência do Motor: " + getPotenciaMotor() + " CV");
    }
}
