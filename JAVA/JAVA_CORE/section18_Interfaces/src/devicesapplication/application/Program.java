package devicesapplication.application;

import java.util.Locale;

import devicesapplication.entities.ComboDevice;
import devicesapplication.entities.ConcretePrinter;
import devicesapplication.entities.ConcreteScan;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScan s = new ConcreteScan("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());


    }
}
