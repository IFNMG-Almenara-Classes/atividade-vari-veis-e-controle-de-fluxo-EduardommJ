package questao9;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args) throws InterruptedException{

        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (i <= 50){
            System.out.println(i);
            i++;
        }


        sc.close();
    }
}
