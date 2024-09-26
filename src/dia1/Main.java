package dia1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        System.out.println("Digite segundo numero: ");

        int num1 = calculadora.nextInt();
        int num2 = calculadora.nextInt();

        int resultado = num1 + num2;

        System.out.println("O resultado é: " + resultado);
    }

}
