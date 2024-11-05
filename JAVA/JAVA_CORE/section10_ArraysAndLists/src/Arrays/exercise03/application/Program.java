package Arrays.exercise03.application;

/*
* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois,
* mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
* com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
*
* Make a program to read the name, age and height of N people, as shown in the example.
* Then, show the average height of people on the screen, and also show the percentage of
* people under 16 years old, as well as the names of these people, if any.
* */

import Arrays.exercise03.entities.PersonHeight;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        System.out.print(" How many People will be registered?  ");
        int amountPerson = readerNumb.nextInt();
        PersonHeight[] personHeights = new PersonHeight[amountPerson];


        int count=1;
        for(int i = 0; i < amountPerson;i++){
                System.out.println("Person "+count+" details:");
                System.out.print("Name: ");
                String name = readerStr.nextLine();
                System.out.print("Age: ");
                int age = readerNumb.nextInt();
                System.out.print("Height: ");
                double height = readerNumb.nextDouble();
                personHeights[i] = new PersonHeight(name,age,height);

                count++;
        }

        double sumHeight =0;
        for(int i = 0; i < amountPerson; i++){
            sumHeight += personHeights[i].getHeightOfPerson();
        }

        double averageHeight = sumHeight/amountPerson;

        int countAge = 0;

        for(int i = 0; i < amountPerson;i++){
          if(personHeights[i].getAgeOfPerson() < 16){
              countAge++;
          }
        }

        double agePersonPct = ( (double)countAge/amountPerson)*100;

        System.out.printf("Average Height: %.2f",averageHeight);
        System.out.printf("\nPeople under 16 yrs: %.1f %% ",agePersonPct);

        System.out.println("\nNames: ");
        for(int i = 0;i <amountPerson;i++){
            personHeights[i].filterNameAge(personHeights[i].getAgeOfPerson());
        }


        readerStr.close();
        readerNumb.close();

    }
}
