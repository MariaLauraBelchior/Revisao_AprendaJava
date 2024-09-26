package dia3;

import java.util.Scanner;

public class Dia3 {
    public static void main(String[] args) {

        Scanner lerNumero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = lerNumero.nextInt();

        if(num <9 && num >=1){
            System.out.println("Este numero tem 1 digito");
        }
        else if(num <100 && num >=10){
            System.out.println("Este numero tem 2 digitos");
        }
        if(num <1000 && num >=100){
            System.out.println("Este numero tem 3 digitos");
        }
        else if(num <10000 && num >=1000){
            System.out.println("Este numero tem 4 digitos");
        }
        else {
            System.out.println("Este numero tem 5 digitos ou mais");
        }
    }

}
