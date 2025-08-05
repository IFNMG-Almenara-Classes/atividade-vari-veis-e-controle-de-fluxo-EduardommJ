package questao17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ecreva um número: ");
        int n1 = sc.nextInt();

        int fat = 1;
        for (int i = n1; i >= 1; i--){

            fat *= i;
        }
        System.out.printf("O fatorial de %d é %d", n1, fat);
        sc.close();
    }
}
