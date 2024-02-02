package exercise01.entities;

public class NegativesNumbers {
    int amountIntegerNumbs;

    public NegativesNumbers(int amountIntegerNumbs){
        this.amountIntegerNumbs = amountIntegerNumbs;

    }

    public void  selectNegativesNumbers(int number){
        if(number < 0 ){
            System.out.println(number);
        }
    }

    public int getAmountIntegerNumbs(){
        return amountIntegerNumbs;
    }

    public void setAmountIntegerNumbs(int amountIntegerNumbs) {
        this.amountIntegerNumbs = amountIntegerNumbs;
    }


}
