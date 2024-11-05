package devicesapplication.entities;

public class ConcreteScan extends Device implements Scan{

    public ConcreteScan(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan(){
        return "Scanned content";
    }

}
