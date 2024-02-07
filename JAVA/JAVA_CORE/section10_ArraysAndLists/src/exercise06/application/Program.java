package exercise06.application;

/*
* Write a program to read two vectors A and B, containing N elements each.
* Then generate a third vector C where each element of C is the sum of the
* corresponding elements of A and B. Print the generated vector C.
*
* Faça um programa para ler dois vetores A e B, contendo N elementos cada.
* Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
* elementos correspondentes de A e B. Imprima o vetor C gerado.
* */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("How many value will each array have ? ");
        int amountInput = reader.nextInt();
        int[] addingArrayA = new int[amountInput];
        int[] addingArrayB = new int[amountInput];
        int[] addingArrayC = new int[amountInput];

        System.out.println("Enter the values of array A:");
        for (int i=0; i < addingArrayA.length;i++){
            int inputValue = reader.nextInt();
            addingArrayA[i] = inputValue;
        }

        System.out.println("\nEnter the values of array B:");
        for (int i=0; i < addingArrayB.length;i++){
            int inputValue = reader.nextInt();
            addingArrayB[i] = inputValue;
        }

        System.out.println("\nResulting Array:");
        for (int i=0; i < amountInput;i++){
            addingArrayC[i] = addingArrayA[i] + addingArrayB[i];
            System.out.println(addingArrayC[i]);
        }

        reader.close();
    }
}
