
import java.util.Scanner;

public class Exercicio1 {

    /*1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
mensagem “Número maior do que 10!”, caso este número seja maior, ou
“Número menor ou igual a 10!”, caso este número seja menor ou igual. */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;


        System.out.println("Digite um número: ");
        i = sc.nextInt();

        System.out.println(i > 10 ? "Número maior do que 10!" : "Número menor ou igual a 10!");
    }
}   
