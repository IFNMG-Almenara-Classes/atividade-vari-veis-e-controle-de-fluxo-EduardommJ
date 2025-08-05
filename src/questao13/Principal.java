package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String []  args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.print("\n1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Sair\n Escolha: ");
        int i = sc.nextInt();
        if (i == 5){
            System.out.println("Programa finalizado");
        }
        while( i != 5){
            if (i == 1){
                System.out.println("Escreva dois números: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int soma = n1 + n2;
                System.out.printf("A soma de %d + %d é igual a %d ", n1, n2, soma);
                System.out.print("\nEscolha uma opção: \n1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Sair\n");
                i = sc.nextInt();
        
            }else if (i == 2){
                System.out.println("Escreva dois números: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int sub  = n1 - n2;
                System.out.printf("A Subtração de %d - %d é igual a %d ", n1, n2, sub);
                System.out.print("\nEscolha uma opção: \n1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Sair\n");
                i = sc.nextInt();
            }else if (i == 3){
                System.out.println("Escreva dois números: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int mult  = n1 * n2;
                System.out.printf("A Multiplicação de %d * %d é igual a %d ", n1, n2, mult);
                System.out.print("\nEscolha uma opção: \n1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Sair\n");
                i = sc.nextInt();
        }else if (i == 4){
                System.out.println("Escreva dois números: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int div  = n1 / n2;
                System.out.printf("A Divisão de %d / %d é igual a %d ", n1, n2, div);
                System.out.print("\nEscolha uma opção: \n1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Sair\n");
                i = sc.nextInt();
        }else if(i == 5){
            System.out.println("Programa Finalidado");
        }else{
            System.out.println("Erro. Valor inválido");
        }
       

    }
    System.out.println("Programa finalizado");
    sc.close();
}
    
}
