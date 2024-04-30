package devicesapplication.application;

import java.util.Locale;
import devicesapplication.entities.ConcretePrinter;
import devicesapplication.entities.ConcreteScan;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScan s = new ConcreteScan("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

    }
}
