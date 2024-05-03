public class Pen {

    String model;
    String color;
    Double tip;
    int filler;
    boolean cover;

    void isScribble(){
        if(cover){
            System.out.println("ERROR");
        }else{
            System.out.println("Scribble");
        }
    }

    boolean getCover(){
        if(cover){
            return true;
        }else {
            return false;
        }
    }

    boolean getUncover(){
        if(!cover){
            return true;
        }else{
            return false;
        }
    }
}
