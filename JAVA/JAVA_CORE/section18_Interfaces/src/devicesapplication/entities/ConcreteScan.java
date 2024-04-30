package devicesapplication.entities;

public class ConcreteScan extends Device {

    public ConcreteScan(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Scanner processing: " + doc);
    }

    public String scan(){
        return "Scanned content";
    }

}
