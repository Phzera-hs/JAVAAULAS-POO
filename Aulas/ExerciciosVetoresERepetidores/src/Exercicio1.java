import java.util.Scanner;

public class Exercicio1 {
    
    /*1. Construa um programa que leia em um vetor uma sequência de 5 números
digitados pelo usuário, calcule a média destes valores, e depois apresente na tela
quais valores que são menores, iguais ou superiores à média */
    
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner sc = new Scanner(System.in);
        int media = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o" + (i+1) + "º numero: " );
            vetor[i] = sc.nextInt();
            media += vetor[i];
        }
        media/=4;

        System.out.println("Numeros digitados!");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println("Media: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < media){
                System.out.println("[" + vetor[i] + "] eh menor que a media("+ media + ")");
            }
            else{
                System.out.println("[" + vetor[i] + "] eh maior ou igual que a media("+ media + ")");
            }
        }
    }

}
