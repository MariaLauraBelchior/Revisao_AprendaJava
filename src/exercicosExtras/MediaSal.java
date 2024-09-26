package exercicosExtras;

import java.util.Scanner;

public class MediaSal {
    
    public static void main(String[] args) {
        Double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite salario do funcionario: ");
        int salFun1 = sc.nextInt();
        System.out.println("Digite salario do funcionario: ");
        int salFun2 = sc.nextInt();
        System.out.println("Digite salario do funcionario: ");
        int salFun3 = sc.nextInt();
        System.out.println("Digite salario do funcionario: ");
        int salFun4 = sc.nextInt();

        media = (double) (salFun1 + salFun2 + salFun3 + salFun4 / 4);
        System.out.println("A média salarial da empresa é de R$ " + media);

    }
}
