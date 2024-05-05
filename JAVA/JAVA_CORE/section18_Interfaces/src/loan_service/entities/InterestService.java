package loan_service.entities;

public interface InterestService {
    double getInterest();

    default double payment(double amount, double month){
        if(month < 1){
            throw new IllegalArgumentException("Mont must be greater than 0 (zero)");
        }
        return amount * Math.pow(1 + getInterest()/100,month);
    }
}
