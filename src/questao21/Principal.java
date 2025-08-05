import java.util.Scanner;

public class Principal {
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        int idade;
        int tempo;

        System.out.println("Escreva sua idade e seu tempo de serviço: ");

        idade = scanner.nextInt();
        tempo = scanner.nextInt();

        if (idade >= 65 || tempo >= 30 || idade >= 60 && tempo >= 25 ){
            System.out.println("Pode Aposentar");
        }else{
            System.out.println("Não pode aposentar");
        }
        





        scanner.close();
    }
}
