package questao10;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 1;
        do{
           System.out.println(i);
           i++;
        }while (i <= 50);


        sc.close();
    }
}
