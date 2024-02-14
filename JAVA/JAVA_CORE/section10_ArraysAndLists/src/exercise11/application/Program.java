package exercise11.application;

/*
* We have a data set containing the height and gender (M, F) of N people. Make a
* program that calculates and writes the largest and smallest height of the group,
* the average height of the best, and the number of men.
*
* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
* Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
* média de altura das melhoeres, e o número de homens.
* */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        System.out.print("How many persons will be entered? ");
        int amountPerson = readerNumb.nextInt();
        double[] height = new double[amountPerson];
        String[] gender = new String[amountPerson];

        int count=1;
        for(int i = 0; i < amountPerson;i++){
            System.out.print("Height of "+count+"º persson:");
            height[i] = readerNumb.nextDouble();
           System.out.print("Gender of "+count+"º persson: ");
            gender[i] = readerStr.nextLine();
            System.out.println();

            count++;
        }


        double lowerHeight = height[0];
        for(int i = 0; i < amountPerson; i++){
            if(lowerHeight > height[i]){
                lowerHeight = height[i];
            }
        }

        double upperHeight = height[0];
        for(int i = 0; i < amountPerson; i++){
            if(upperHeight < height[i]){
                upperHeight = height[i];
            }
        }
        double sumGenderWomen=0;
        int countGender = 0;
        for (int i =0; i < amountPerson;i++){
            if(gender[i].equalsIgnoreCase("F")){
                sumGenderWomen += height[i];
                countGender ++;
            }
        }
        double averageHeigh = sumGenderWomen/countGender;

        int sumGenderMen = 0;
        for (int i =0; i<amountPerson;i++){
            if(gender[i].equalsIgnoreCase("M")){
                sumGenderMen ++;
            }
        }

        System.out.printf("\nLOWEST HEIGHT = %.2f",lowerHeight);
        System.out.printf("\nGREATER HEIGHT  = %.2f", upperHeight);
        System.out.printf("\nAVERAGE HEIGHT OF WOMEN'S = %.2f",averageHeigh);
        System.out.println("\nNUMBERS OF MENS = "+sumGenderMen);

        readerStr.close();
        readerNumb.close();
    }

}
