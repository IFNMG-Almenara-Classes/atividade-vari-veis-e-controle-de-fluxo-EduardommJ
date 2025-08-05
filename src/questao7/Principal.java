package questao7;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva as medidas de cada lado do triângulo: ");

        System.out.print("Lado 1: ");
        int n1 = sc.nextInt();

        System.out.print("Lado 2: ");
        int n2 = sc.nextInt();

        System.out.print("Lado 3: ");
        int n3 = sc.nextInt();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2)){
            if (n1 == n2 && n2 == n3){
                System.out.println("Triângulo Equilátero");

            }else if(n1 == n2 && n2 != n3 || n2 == n3 && n3 != n1 || n1 == n3 && n3 != n2){
                System.out.println("Triângulo Isósceles");
    
            }else if (n1 != n2 && n2 != n3 && n3 != n1){
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.println("Inválido");
        }
            

        sc.close();
    }
}
