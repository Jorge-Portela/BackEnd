package rentcar.model.services;

public class BrazilTaxService implements TaxService{

    public Double tax(Double amount) {
        if (amount <= 100) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
