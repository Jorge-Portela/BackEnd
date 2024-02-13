package exercise09.application;

/*
* Make a program to read a set of people's names and their respective ages.
* Names must be stored in one vector, and ages in another vector. Then, show
* the name of the oldest person on the screen.
*
* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
* idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor.
* Depois, mostrar na tela o nome da pessoa mais velha.
* */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        System.out.print("How many persons will you entered? ");
        int amountInput = readerNumb.nextInt();;
        String[] namePersons = new String[amountInput];
        int[] agePersons = new int[amountInput];

        int count = 1;
        for (int i = 0; i < amountInput; i++){
            System.out.println("Person Data "+count+":");
            System.out.print("Name: ");
            namePersons[i] = readerStr.nextLine();
            System.out.print("Age: ");
            agePersons[i] = readerNumb.nextInt();
            count++;
        }

        int lowerAge = 0;
        String receiveName = null;
        for(int i = 0; i < amountInput;i++){
            if(lowerAge < agePersons[i]){
                lowerAge = agePersons[i];
                receiveName = namePersons[i];
            }
        }

        System.out.println("OLDER PERSON: "+receiveName);

        readerStr.close();
        readerNumb.close();
    }
}
