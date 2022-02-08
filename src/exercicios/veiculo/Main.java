package exercicios.veiculo;

import exercicios.veiculo.domain.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Tesla", "X", "BRA 0411", "Black", "0km", false, 0, 0, 99.990);

        veiculo.accelerate();
        System.out.println(veiculo.getSpeed());
        veiculo.toFuel(12);
        System.out.println(veiculo.getFuel());
//        veiculo.toFuel(70);
        System.out.println(veiculo.getFuel());
        veiculo.toBreak();
        System.out.println(veiculo.getSpeed());
//        veiculo.toBreak();
        System.out.println(veiculo.getSpeed());
        System.out.println(veiculo.getColor());
        veiculo.print("Red");
        System.out.println(veiculo.getColor());
        System.out.println(veiculo.isConnected());
//        veiculo.connected();
        veiculo.unconnected();
        System.out.println(veiculo.isConnected());


    }
}
