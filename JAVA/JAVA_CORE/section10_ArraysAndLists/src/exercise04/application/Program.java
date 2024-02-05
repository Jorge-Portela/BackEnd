package exercise04.application;

import java.util.Locale;
import java.util.Scanner;
/*
* Write a program that reads N integers and stores them in a vector. Then,
* show all even numbers on the screen, and also the number of even numbers.
*
* Faça um programa que leia N números inteiros e armazene-os em um vetor.
* Em seguida, mostre na tela todos os números pares, e também a quantidade
* de números pares.
* */
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner readerNumb = new Scanner(System.in);

        System.out.print("How many numbers will you entered? ");
        int amountNumb = readerNumb.nextInt();

        int[] pairsNumb = new int[amountNumb];

        int inputNumb;
        for (int i = 0;i < pairsNumb.length; i++){
            System.out.print("Enter a number: ");
            pairsNumb[i] = inputNumb = readerNumb.nextInt();
        }

        System.out.println("\nPAIR NUMBERS: ");
        int count = 0;
        for(int i = 0; i < pairsNumb.length; i++){
            if( pairsNumb[i] % 2 == 0){
                System.out.print(pairsNumb[i]+ "  ");
                count++;
            }
        }

        System.out.println("\n\nNUMBER OF PAIRS = " + count);

        readerNumb.close();

    }
}
