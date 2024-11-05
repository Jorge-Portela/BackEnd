package Arrays.exercise04.application;

import Arrays.exercise04.entities.PairsNumb;

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

        PairsNumb[] pairsNumb = new PairsNumb[amountNumb];


        for (int i = 0;i < pairsNumb.length; i++){
            System.out.print("Enter a number: ");
            int inputNumb = readerNumb.nextInt();
            pairsNumb[i] = new PairsNumb(inputNumb);
        }

        System.out.println("\nPAIR NUMBERS: ");
        int count = 0;
        for(int i = 0; i < pairsNumb.length; i++){
          if(pairsNumb[i].getInputNumb() % 2 ==0){
              System.out.print(pairsNumb[i].getInputNumb() + "  ");
              count++;
          }

        }

        System.out.println("\n\nNUMBER OF PAIRS = " +count);

        readerNumb.close();

    }
}
