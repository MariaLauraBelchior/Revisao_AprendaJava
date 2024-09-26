package dia8;

public class Carro {

    String marca;
    String modelo;
    int numPassaggeiro;
    double capCombustivel;
    double consumoCombustivel;
    

    void exibirAutonomia() { //metodo simples
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel  + " km ");
    }

    double obterAutonomia(){ //metodo c retorno

        return capCombustivel * consumoCombustivel;
    }
}
