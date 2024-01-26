package exercise3.application;

import exercise3.entities.Grade;

import java.util.Locale;
import java.util.Scanner;

/*
* Create a program to read a student's name and the three grades he obtained in the three quarters of
* the year (first quarter is worth 30 and the second and third are worth 35 each). At the end, show the
* student's final grade in the year. Also say whether the student is approved (PASS) or not (FAILED) and,
* if not, how many points are left for the student to obtain the minimum to pass (which is 60% of the grade).
* You must create a Student class to solve this problem.
*
* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres
* do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual
* a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em
* caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
* Você deve criar uma classe Student para resolver este problema.
*/

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        Grade student1 = new Grade();

        System.out.print("Enter student name: ");
        student1.name = reader.nextLine();

        System.out.println("\nEnter First Grade (MAX 30 POINT): ");
        student1.firstGrade = reader.nextDouble();
        while(student1.firstGrade < 0 || student1.firstGrade > 30){
            System.out.println("Please,  VALUE MIN: 0 AND MAX 30 POINTS: ");
            student1.firstGrade = reader.nextDouble();
        }


        System.out.println("\nEnter Second Grade");
        student1.secondGrade = reader.nextDouble();
        while(student1.secondGrade < 0 || student1.secondGrade > 35){
            System.out.println("Please,  VALUE MIN: 0 AND MAX 35 POINTS: ");
            student1.secondGrade = reader.nextDouble();
        }

        System.out.println("\nEnter Third Grade");
        student1.thirdGrade = reader.nextDouble();
        while(student1.thirdGrade < 0 || student1.thirdGrade > 35){
            System.out.println("Please,  VALUE MIN: 0 AND MAX 35 POINTS: ");
            student1.thirdGrade = reader.nextDouble();
        }

        System.out.println("\n"+student1);

        student1.validateGrade();

        reader.close();
    }

}
