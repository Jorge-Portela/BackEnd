package Arrays.examples.example01.application;

import java.util.Locale;
import java.util.Scanner;

/*
* Fazer um programa para ler um número inteiro N e a altura de N
* pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
* altura média dessas pessoas.
*
* Write a program to read an integer N and the height of N
* people. Store the N heights in a vector. Then show the
* average height of these people.
* */

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number total of heights to be input: ");
        int n = reader.nextInt();

        double [] vector = new double[n];

        int count = 1;
        for(int i=0; i<vector.length;i++){
            System.out.print("Enter height " + count + ": ");
            vector [i]= reader.nextDouble();
            count ++;
        }

        double sum = 0.0;
        for(int i=0; i< vector.length;i++){
            sum += vector[i];
        }

        double average = sum/n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n",average);

        reader.close();
    }
}
