
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int num = 1;
        int soma = 0;
        
        while(num > 0){

            System.out.println("Escreva um número: ");
            num = sc.nextInt();

            if (num % 2 == 0 && num != 0){
                soma += num;
                lista.add(num);

            }else if(num == 0){
                System.out.println("Finalizado");
            }

            
          
        }
        int quant = lista.size();
        System.out.println(lista);
        int media = soma / quant;
        System.out.printf("Foram digitados %d números pares\n", quant);

        System.out.println("Média: " + media);



        sc.close();

    }
}
