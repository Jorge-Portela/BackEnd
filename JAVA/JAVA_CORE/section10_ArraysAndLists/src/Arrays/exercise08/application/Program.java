package Arrays.exercise08.application;

import Arrays.exercise08.entities.EvenPairs;

import java.util.Locale;
import java.util.Scanner;

/*
* Make a program to read a vector of N integers. Then, show on the screen the
* arithmetic mean of only the even numbers read, with one decimal place.
* If no even number is entered, display the message "NO EVEN NUMBERS".
*
* Fazer um programa para ler um vetor de N números inteiros. Em seguida,
* mostrar na tela a média aritmética somente dos números pares lidos,
* com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem
* "NENHUM NUMERO PAR".
* */
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("How many elements will the array have? ");
        int amountInput = reader.nextInt();
        EvenPairs[] evenPair = new EvenPairs[amountInput];

        for(int i = 0; i < evenPair.length;i++){
            System.out.print("Enter a number: ");
            evenPair[i] = new EvenPairs(reader.nextInt());
        }

        double sumInputs = 0, countEven = 0;

        for(int i = 0; i < amountInput;i++){
            if(evenPair[i].getInputNumbers() % 2 == 0){
                sumInputs += evenPair[i].getInputNumbers();
                countEven++;
            }
        }

        double averageInput = sumInputs/countEven;

        if (averageInput > 0){
            System.out.printf("AVERAGE OF EVENS =  %.1f",averageInput);
        }else{
            System.out.println("NO EVEN NUMBER");
        }

        reader.close();
    }

}

