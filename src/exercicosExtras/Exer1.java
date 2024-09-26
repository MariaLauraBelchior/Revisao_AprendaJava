package exercicosExtras;

import java.util.Scanner;

/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

public class Exer1 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite os anos: ");
        int anos = idade.nextInt();
        System.out.println("Digite os meses: ");
        int meses = idade.nextInt();
        System.out.println("Digite os dias: ");
        int dias = idade.nextInt();

        int idadeTotalDias = anos * 365 + meses * 30 + dias;
        System.out.println("Idade total em dias = " + idadeTotalDias+"\n");
    }

}
// acho que esse calculo ta errado mais cara quem quer saber a idade em dias é louco