public class Teste {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            var veiculo = new Veiculo();
            veiculo.setCor("Azul");
            veiculo.setMarca("Ford-" + i);
            veiculo.setModelo("Modelo" + i);
            veiculo.setPlaca("AAA" + i + "B00");
            veiculo.setQtdRodas(4);
            veiculo.setVelocMax(60 + (i*5));
            veiculo.getMotor().setPotencia(500 + (i*10));
            veiculo.getMotor().setQtdPist(4+i);
            System.out.println(veiculo);
        }
    }
}
