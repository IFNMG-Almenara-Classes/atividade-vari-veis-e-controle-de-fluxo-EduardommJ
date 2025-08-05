package questão14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite: 1 - Comum; 2 - Funcionário; 3 - VIP");
        int n1 = sc.nextInt();

        System.out.println("Escreva o valor da pizza: ");
        double valor = sc.nextInt();

        if (n1 == 1){
            System.out.println("Cliente Comum");
            System.out.printf("Valor da pizza %.2f reais. Não possui desconto", valor );

        }else if (n1 == 2){
            System.out.println("Cliente VIP");

            System.out.printf("Valor da pizza %.2f reais. Com o desconto %.2f reias", valor, valor - (valor * 0.05) );

        }else{
            System.out.println("Funcionário");

            System.out.printf("Valor da pizza %.2f reais. Com o desconto %.2f reias", valor, valor - (valor * 0.1) );
        }



        sc.close();
    }
}
