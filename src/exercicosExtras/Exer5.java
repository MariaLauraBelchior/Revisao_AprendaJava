package exercicosExtras;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */

public class Exer5 {
    public static void main(String[] args) {
        
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite seu salario");
        int salMin = salario.nextInt();

        if(salMin <=1320){
            System.out.println(salario + " Recebe 1 Salario minimo ");
        }
        else if(salMin >=1320 && salMin <=2640){
            System.out.println(salario + "Recebe até 2 Salario minimos ");
        }
        if(salMin >=2640 && salMin <=3960){
            System.out.println(salario + "Recebe até 3 Salario minimos ");
        }
        else if(salMin >=3960 && salMin <=5280){
            System.out.println(salario + "Recebe até 4 Salario minimos ");
        }

    }

}
