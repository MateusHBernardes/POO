public class FabricaV4 {

    public static void main(String[] args) {

        //  SolicitarDados dados = new SolicitarDados();
        String modeloRetoro = EntradaSaida.solicitarModelo();
        String corRetorno = EntradaSaida.solicitarCor();
        CarroOficial car = new CarroOficial();
        car.setModelo(modeloRetoro);
        car.setCor(corRetorno);

        System.out.println(car.getModelo() + "" + car.getCor());
    }
}