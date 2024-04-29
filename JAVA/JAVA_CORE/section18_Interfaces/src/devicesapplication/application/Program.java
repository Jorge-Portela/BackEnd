package devicesapplication.application;

import java.util.Locale;
import devicesapplication.entities.Printer;
import devicesapplication.entities.Scan;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Printer p = new Printer("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        Scan s = new Scan("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

    }
}
