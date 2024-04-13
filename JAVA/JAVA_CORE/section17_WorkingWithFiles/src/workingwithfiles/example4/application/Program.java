package workingwithfiles.example4.application;

import java.util.Scanner;
import java.io.File;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = reader.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder.getName());
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file.getName());
        }

        boolean sucess = new File(strPath+"\\subdir").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        reader.close();
    }
}
