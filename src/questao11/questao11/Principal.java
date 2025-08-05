package questao11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

       
        System.out.println("Escreva um número: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++){
            
            if (i % 2 == 0 && i != 0){
                lista.add(i);
            }
        }
    
        System.out.println(lista);
        sc.close();
    }
}