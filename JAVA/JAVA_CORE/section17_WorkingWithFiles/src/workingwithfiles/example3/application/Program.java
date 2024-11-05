package workingwithfiles.example3.application;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"Floki","Thorvyn", "Odin"};

        String path = "/path/to/file.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
