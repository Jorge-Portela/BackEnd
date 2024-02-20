package Arrays.exercise09.application;

/*
* Make a program to read a set of people's names and their respective ages.
* Names must be stored in one vector, and ages in another vector. Then, show
* the name of the oldest person on the screen.
*
* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
* idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor.
* Depois, mostrar na tela o nome da pessoa mais velha.
* */

import Arrays.exercise09.entities.OlderPerson;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        System.out.print("How many persons will you entered? ");
        int amountInput = readerNumb.nextInt();;
        OlderPerson[] person = new OlderPerson[amountInput];


        int count = 1;
        for (int i = 0; i < person.length; i++){
            System.out.println("Person Data "+count+":");
            System.out.print("Name: ");
            String name = readerStr.nextLine();
            System.out.print("Age: ");
            int age = readerNumb.nextInt();
            person[i] = new OlderPerson(name,age);
            count++;
        }

        int lowerAge = 0;
        String receiveName = null;
        for(int i = 0; i < person.length;i++){
            if(lowerAge < person[i].getAge()){
                lowerAge = person[i].getAge();
                receiveName = person[i].getName();
            }
        }

        System.out.println("OLDER PERSON: "+receiveName);

        readerStr.close();
        readerNumb.close();
    }
}
