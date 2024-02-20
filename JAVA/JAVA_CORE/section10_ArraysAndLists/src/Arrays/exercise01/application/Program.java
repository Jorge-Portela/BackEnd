package Arrays.exercise01.application;

import Arrays.exercise01.entities.NegativesNumbers;

import java.util.Locale;
import java.util.Scanner;

/*
*                  Problema "negativos"
* Faça um programa que leia um número inteiero positivo N (Máximo = 10) e
*  depois N números inteiros e armazene-os em um vetor. Em seguida,
* mostra na tela todos os números negativos lidos.
*
* Exemplo:
* Quantos numeros você vai digitar: 6
* Digite um número: 8
* Digite um número: -2
* Digite um número: 9
* Digite um número: 10
* Digite um número: -3
* Digite um número: -7
* NUMEROS NEGATIVOS:
* -2
* -3
* -7
* */

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

         NegativesNumbers[] integerNumb = new NegativesNumbers[10];
         System.out.print("How many numbers will you enter: ");
         int amountIntegerNumbs = reader.nextInt();

        for(int i = 0; i < amountIntegerNumbs;i++){
            System.out.print("Enter a number: ");
            int inputNumber ;
            integerNumb[i] = new NegativesNumbers(inputNumber = reader.nextInt());
         }

         System.out.println("NEGATIVES NUMBERS: ");

         for(int i =0; i < amountIntegerNumbs;i++){
            integerNumb[i].selectNegativesNumbers(integerNumb[i].getAmountIntegerNumbs());

         }


        reader.close();
    }

}
