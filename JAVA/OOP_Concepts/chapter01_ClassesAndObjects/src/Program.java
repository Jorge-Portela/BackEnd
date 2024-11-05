public class Program {
    public static void main(String[] args){

        Pen pen1 = new Pen();
        pen1.model = "Mont Blanc";
        pen1.color = "Black";
        pen1.tip = 0.50;
        pen1.filler = 15;
        pen1.cover = false;

        pen1.isScribble();

        System.out.println("The Pen is covered ? True = Yes , False = No. Answer: "+pen1.getCover());

        System.out.println("The Pen need to be Uncovered ? True = Yes , False = No. Answer: "+pen1.getUncover());

        System.out.println();

        pen1.status();


    }
}
