package Arrays.exercise11.application;

/*
* We have a data set containing the height and gender (M, F) of N people. Make a
* program that calculates and writes the largest and smallest height of the group,
* the average height of the best, and the number of men.
*
* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
* Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
* média de altura das melhoeres, e o número de homens.
* */

import Arrays.exercise11.entities.PersonData;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);


        System.out.print("How many persons will be entered? ");
        int amountPerson = reader.nextInt();
        PersonData[] person = new PersonData[amountPerson];



        for(int i = 0; i < amountPerson;i++){
            System.out.print("Height of "+(i+1)+"º persson:");
            double height = reader.nextDouble();
            System.out.print("Gender of "+(i+1)+"º persson: ");
            char gender = reader.next().charAt(0);
            person[i] = new PersonData(height,gender);
            System.out.println();
        }


        double lowerHeight = 0;
        for(int i = 0; i < amountPerson; i++){
            if(lowerHeight > person[i].getHeight()){
                lowerHeight = person[i].getHeight();
            }
        }

        double upperHeight = 0;
        for(int i = 0; i < amountPerson; i++){
            if(upperHeight < person[i].getHeight()){
                upperHeight = person[i].getHeight();
            }
        }

        double sumGenderWomen=0;
        int countGender = 0;
        for (int i =0; i < amountPerson;i++){
            if(Character.toUpperCase(person[i].getGender()) == 'F'){
                sumGenderWomen += person[i].getHeight();
                countGender ++;
            }
        }

        double averageHeight = sumGenderWomen/countGender;

        int sumGenderMen = 0;
        for (int i =0; i<amountPerson;i++){
            if(Character.toUpperCase(person[i].getGender()) == 'M'){
                sumGenderMen ++;
            }
        }

        System.out.printf("\nLOWEST HEIGHT = %.2f",lowerHeight);
        System.out.printf("\nGREATER HEIGHT  = %.2f", upperHeight);
        System.out.printf("\nAVERAGE HEIGHT OF WOMEN'S = %.2f",averageHeight);
        System.out.println("\nNUMBERS OF MENS = "+sumGenderMen);

        reader.close();
    }

}
