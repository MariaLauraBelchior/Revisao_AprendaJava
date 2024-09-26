package dia7;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        // N é igual ao numero impar2
        if (N % 2 != 0) {
            System.out.println(N + " é um número ímpar.");
        } else {
            System.out.println(N + " é um número par.");
        }// N é par e está entre 2 e 6 -A
        if (N <=2 && N >=6) {
            System.out.println(N + " é um número par e está entre 2 e 6. (A)");
        } else if (N <=6 && N >=20) { // N é par entre 6 e 20 -B
            System.out.println(N + " é um número par e está entre 6 e 20. (B)");
        } else if (N >=20) { // N é par e está acime de 20 -C 
            System.out.println(N + " é um número par e está acima 20. (C)");
        }
    }
}
