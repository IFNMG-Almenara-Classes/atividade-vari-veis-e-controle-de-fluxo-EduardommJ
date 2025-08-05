package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        int n1 = sc.nextInt();


        for (int i = 1; i <= 10; i++){
            int multi = i * n1;
            System.out.printf("%d x %d = %d \n", i, n1, multi);
           
        }

        for (int i = 10; i >= 1; i--){
            double div = n1 / i;
            System.out.printf("%d / %d = %2f \n", n1,i, div);
           
        }
        sc.close();
    }
}
