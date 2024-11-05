package Arrays.exercise05.application;


import Arrays.exercise05.entities.HighestPlace;

import java.util.Locale;
import java.util.Scanner;

/*
* Write a program that reads N real numbers and stores them in a vector. Then, show
* the largest number in the vector on the screen (assuming there are no ties). Also
* show the position of the largest element, considering the first position as 0 (zero).
*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
* mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a
* posição do maior elemento, considerando a primeira posição como 0 (zero).
* */

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("How many numbers will you entered? ");
        int amountNumb = reader.nextInt();

        HighestPlace[] higherPlace = new HighestPlace[amountNumb];

        for(int i=0; i < higherPlace.length;i++){
            System.out.print("Enter a number: ");
            double inputNumb = reader.nextDouble();
            higherPlace[i] = new HighestPlace(inputNumb);
        }

        double higherIndex = 0;
        int index = 0;
        for(int i = 0; i < higherPlace.length;i++){
                if(higherIndex < higherPlace[i].getInputNumb()){
                higherIndex = higherPlace[i].getInputNumb();
                index = i;
            }
        }

        System.out.printf("\nHIGHEST VALUE = %.1f",higherIndex);
        System.out.println("\nHIGHEST VALUE POSITION = "+index);
        reader.close();
    }
}
