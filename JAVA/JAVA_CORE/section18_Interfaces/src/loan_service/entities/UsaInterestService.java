package loan_service.entities;

public class UsaInterestService {

    private double interestRate;

    public UsaInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double payment(double amount, int month){
        if(month < 1){
            throw new IllegalArgumentException("Month must be greater than 0 (zero)");
        }
        return amount * Math.pow(1.0 + interestRate/100, month );
    }
}
