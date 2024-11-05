package loan_service.entities;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, double month){
        if(month < 1){
            throw new IllegalArgumentException("Month must be greater than 0 (zero)");
        }
        return amount * Math.pow(1 + getInterestRate()/100,month);
    }
}
