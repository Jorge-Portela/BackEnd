package devicesapplication.entities;

public class ConcretePrinter extends Device {

    public ConcretePrinter(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public void print(String doc){
        System.out.println("Printing: " + doc);
    }

    

}
