package exercicosExtras;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        int qtMulheres = 0; 
        int qtHomens = 0; 
        float somaH = 0;
        float mediaH;
        float maior = 0;
        float menor = 0;

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++) {
        System.out.println("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
        int sexo = sc.nextInt();
        System.out.println("Digite a Altura: ");
        float altura = sc.nextFloat();
            if(sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção inválida! ");
            }
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }
        mediaH = somaH / qtHomens;

        System.out.println("A maior altura do grupo é de " + maior + " metros , e a menor é de " + menor + " metros");
        System.out.println("A média de altura dos homens é " + mediaH + " metros ");
        System.out.println("O número de mulheres é " + qtMulheres);

        sc.close();
    }

    
}
