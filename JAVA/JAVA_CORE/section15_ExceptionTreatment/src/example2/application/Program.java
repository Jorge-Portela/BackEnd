package example2.application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        File file = new File("path/to/file.txt");

        Scanner reader = null;

        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
