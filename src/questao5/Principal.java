package questao5;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de laranjas: ");
        int quantidade = sc.nextInt();

        double preco;

        if (quantidade < 12) {
            preco = 0.50;
        } else {
            preco = 0.30;
        }

        double total = quantidade * preco;

        System.out.printf("Valor total da compra: R$ %.2f%n", total);

        sc.close();
    }
}
