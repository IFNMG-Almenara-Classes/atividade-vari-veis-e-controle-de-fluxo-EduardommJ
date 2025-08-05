package questao6;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int menor = n1;

        if (n2 < menor){
            menor = n2;
        }
        if (n3 < menor){
            menor = n3;
        }
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
