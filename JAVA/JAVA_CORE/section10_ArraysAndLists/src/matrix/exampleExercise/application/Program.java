package matrix.exampleExercise.application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the amount of rows and columns: ");
        int amountRowAndColumn = reader.nextInt();

        int [][] matrix = new int[amountRowAndColumn][amountRowAndColumn];

        System.out.println();

        for(int i = 0; i < matrix.length;i++){
            for(int j =0; j < amountRowAndColumn;j++){
                System.out.println("Enter row " + i + " and column " + j + " value: ");
                matrix[i][j] = reader.nextInt();
            }
        }

        System.out.println("\nMatrix: ");
        for(int i = 0;i < amountRowAndColumn;i++){
            for (int j =0; j <amountRowAndColumn;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }

        System.out.println("\nMain diagonal: ");
        for(int i = 0; i < matrix.length;i++){
            System.out.print(matrix[i][i]+ " ");
        }

        int count=0;
        for(int i = 0; i < matrix.length;i++){
            for (int j = 0; j < amountRowAndColumn;j++){
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.print("\nNegative numbers = "+count);


        reader.close();
    }
}
