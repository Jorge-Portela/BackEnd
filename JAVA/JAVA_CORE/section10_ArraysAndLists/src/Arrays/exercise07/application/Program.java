package Arrays.exercise07.application;

/*
* Make a program to read an integer N and then a vector of N real numbers.
* Then, show on the screen the arithmetic mean of all elements with three
* decimal places. Then show all elements of the vector that are below the
* average, with one decimal place each.
*
* Fazer um programa para ler um número inteiro N e depois um vetor de N
* números reais. Em seguida, mostrar na tela a média aritmética de todos
* os elementos com três casas decimais. Depois mostrar todos os elementos
* do vetor que estejam abaixo da média, com uma casa decimal cada.
* */

import Arrays.exercise07.entities.BelowOfAverage;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("How many elements will the array have? ");
        int amountElements = reader.nextInt();
        BelowOfAverage[] averageArray = new BelowOfAverage[amountElements];

        double sumElements =0.0;
        for(int i = 0; i < averageArray.length;i++){
            System.out.print("Enter a number: ");
            double inputNumb = reader.nextDouble();
            averageArray[i] = new BelowOfAverage(inputNumb);
            sumElements += averageArray[i].getInputNumb();
        }

        double averageElements = sumElements/averageArray.length;
        System.out.printf("\nARRAYS AVERAGE = %.3f",averageElements);

        System.out.println("\nELEMENTS BELOW OF AVERAGE: ");
        for(int i =0; i < amountElements;i++){
            if(averageArray[i].getInputNumb() < averageElements){
                System.out.println(averageArray[i].getInputNumb());
            }
        }

        reader.close();
    }
}
