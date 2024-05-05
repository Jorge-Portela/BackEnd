package loan_service.entities;

import java.security.InvalidParameterException;

public class BrazilInterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double payment(double amount, int month){
        if(month < 1){
            throw new InvalidParameterException("Month must be greater than '0' zero  ");
        }
        return amount * Math.pow(1.0 + interestRate / 100.0,month);
    }

}
