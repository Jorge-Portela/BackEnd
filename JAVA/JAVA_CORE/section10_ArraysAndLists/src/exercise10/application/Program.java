package exercise10.application;

/*
* Make a program to read a set of N student names, as well as the grades they got in
* the 1st and 2nd semesters. Each of this information must be stored in a vector. Then,
* print the names of approved students, considering those whose grade average is greater
* than or equal to 6.0 (six) as approved.
*
* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que
* eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada
* em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados
* aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
* */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner readerStr = new Scanner(System.in);
        Scanner readerNumb = new Scanner(System.in);

        System.out.print("How many students will be enrolled? ");
        int amountStudent = readerNumb.nextInt();
        String[] nameOfStudent = new String[amountStudent];
        double[] firstGrade = new double[amountStudent];
        double[] secondGrade = new double[amountStudent];

        int count = 1;
        for(int i = 0; i < amountStudent;i++){
            System.out.println("\nEnter  the "+count+"° student data: ");
            System.out.print("Name: ");
            nameOfStudent[i] = readerStr.nextLine();
            System.out.print("First Grade: ");
            firstGrade[i] = readerNumb.nextDouble();
            System.out.print("Second Grade: ");
            secondGrade[i] = readerNumb.nextDouble();
            count++;

        }
        double averageGrade = 0;
        System.out.println("APPROVED STUDENTS: ");
        for(int i = 0; i < amountStudent;i++){
            averageGrade = (firstGrade[i] + secondGrade[i])/2;
            if(averageGrade >= 6.0){
                System.out.println(nameOfStudent[i]);
            }
        }





        readerStr.close();
        readerNumb.close();
    }

}
