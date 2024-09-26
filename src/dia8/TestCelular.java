package dia8;

public class TestCelular {
    public static void main(String[] args) {
        
        Celular samsung = new Celular();
        samsung.modelo = "Galaxy A15";
        samsung.ano = 2021;
        samsung.peso = 20.7;
        samsung.sistemaOp = "Android";
        samsung.armazenamento = "128 GB"; 
        samsung.gps = true;
        samsung.cor = "Azul";

        System.out.println(samsung.modelo);
        System.out.println(samsung.ano);
        System.out.println(samsung.armazenamento);
        System.out.println(samsung.gps);
        System.out.println(samsung.cor);
    }
}
