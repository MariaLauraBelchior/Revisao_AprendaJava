package exercicosExtras;

public class Temperatura {
    public static void main(String[] args) {
        Double C;
        Double K;
        Double F;
        Double Re;
        Double Ra;

        C = 2.43;

        F = C * 1.8 + 32; 
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println(F + " Graus celsius em Fahrenheit");
        System.out.println(K + " Graus celsius em Kelvin");
        System.out.println(Re + " Graus celsius em Réaumur");
        System.out.println(Ra + " Graus celsius em Rankine");
    }
    

}
