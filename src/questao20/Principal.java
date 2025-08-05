package questao20;

import java.util.Scanner;
public class Principal {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num = scanner.nextInt();

        if (num % 3  == 0 && num % 5 == 0  ){
            System.out.println("Esse número é dividido por 3 e por 5");
        }else if (num % 3  == 0){
            System.out.println("Esse número é divisivél apenas por 3");
        }else if (num % 5  == 0){
            System.out.println("Esse número é divisivél apenas por 5");
        }else{
            System.out.println("Não é divisivél por 3 e nem 5");
        }





        scanner.close();
    }
}
