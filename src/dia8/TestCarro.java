package dia8;

public class TestCarro {

    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassaggeiro = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();

        System.out.println("A autonomia do carro é: " + van.obterAutonomia() + "km ");

    }
    
}
