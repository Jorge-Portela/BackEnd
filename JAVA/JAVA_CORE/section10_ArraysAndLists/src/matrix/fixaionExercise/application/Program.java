package matrix.fixaionExercise.application;

/*
 * Make a program to read two integers M and N, and then read
 * a matrix of M rows by N columns containing integers,
 * there may be repetitions. Then read an integer X that
 * belongs to the matrix. For each occurrence of
 * left, above, right and below X, when applicable.
 *
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
 * uma matriz de M linhas por N colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro X que
 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 * esquerda, acima, à direita e abaixo de X, quando houver.
 * */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Rows values: ");
        int amountRow = reader.nextInt();

        System.out.print("Enter Column values: ");
        int amountColumn = reader.nextInt();
        int[][] matrix = new int[amountRow][amountColumn];

        System.out.println();
        for (int i = 0; i < amountRow; i++) {
            for (int j = 0; j < amountColumn; j++) {
                System.out.print("Enter Row " + (i) + " and Column " + (j) + " value: ");
                matrix[i][j] = reader.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < amountRow; i++) {
            for (int j = 0; j < amountColumn; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.print("\nEnter a number of Matrix: ");
        int valueSearchMatrix = reader.nextInt();

        for (int i = 0; i < amountRow; i++) {
            for (int j = 0; j < amountColumn; j++) {
                if (matrix[i][j] == valueSearchMatrix) {
                    System.out.println("\nPOSITION: Row: " + i + " | Column: " + j);
                    if (j > 0) {
                        System.out.println("Element on Left: " + (matrix[i][j - 1]));
                    }
                    if (i > 0) {
                        System.out.println("Element on Up: " + (matrix[i - 1][j]));
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Element on Right: " + (matrix[i][j + 1]));
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Element on Down: " + (matrix[i + 1][j]));
                    }
                }
            }
        }

        reader.close();
    }
}
