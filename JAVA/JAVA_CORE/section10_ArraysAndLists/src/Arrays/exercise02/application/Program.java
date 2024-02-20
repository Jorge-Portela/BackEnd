package Arrays.exercise02.application;

import Arrays.exercise02.entities.RealNumbers;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
* Imprima todos os elementos do vetor
* Mostre na tela a soma e a média dos elementos do vetor.
* Exemplo:
* Quantos numeros voce vai digitar? 4
* Digite um numero: 8.0
* Digite um numero: 4.0
* Digite um numero: 10.0
* Digite um numero: 14.0
* VALORES = 8.0 4.0 10.0 14.0
* SOMA = 36.00
* MEDIA = 9.00
* */
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        RealNumbers [] realNumbers;
        System.out.print("How many numbers will you enter: ");
        int amountNumbers =  reader.nextInt();
        realNumbers = new RealNumbers[amountNumbers];


        for(int i = 0; i < realNumbers.length; i++ ){
            System.out.print("Enter a number: ");
            double inputNumber = reader.nextDouble();
            realNumbers[i] = new RealNumbers(inputNumber);
        }

        //Show the floated numbers inserted in array
        System.out.print("VALUES = ");
        for(int i = 0; i < amountNumbers; i++){
            System.out.print(realNumbers[i].getInputNumber() + "  ");
        }

        double sum = 0;
        for(int i = 0; i < amountNumbers; i++){
            sum += realNumbers[i].getInputNumber();
        }
        System.out.printf("\nSUM = %.2f", sum);

        double average = sum/realNumbers.length;
        System.out.printf("\nAVERAGE = %.2f", average);

        reader.close();

    }
}
