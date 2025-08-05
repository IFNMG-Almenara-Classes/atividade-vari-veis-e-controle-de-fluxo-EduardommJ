package questao8;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args) throws InterruptedException{

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }



        sc.close();
    }
}
