package workingwithfiles.example1.application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        File file = new File("path");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }


    }
}
