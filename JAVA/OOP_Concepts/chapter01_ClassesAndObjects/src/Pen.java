public class Pen {

    String model;
    String color;
    Double tip;
    int filler;
    boolean cover;

    void status(){
        System.out.println("Pen model: " + this.model);
        System.out.println("Pen color: " + this.color);
        System.out.println("Pen tip: " + this.tip);
        System.out.println("Pen filler: " + this.filler);
        System.out.println("Pen cover: " + this.cover);
    }

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
