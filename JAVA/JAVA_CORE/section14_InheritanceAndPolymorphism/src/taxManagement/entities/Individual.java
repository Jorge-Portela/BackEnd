package taxManagement.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double individualTax = 0.0;
        if (this.getAnnualIncome() < 20000.0) {
            individualTax = (this.getAnnualIncome() * (15 * 0.01)) - (this.getHealthExpenditures() * (50 * 0.01));

        } else {
            individualTax = (this.getAnnualIncome() * (25 * 0.01)) - (this.getHealthExpenditures() * (50 * 0.01));

        }
        return individualTax;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(": ");
        sb.append("$ ").append(String.format("%.2f",this.tax()));
        return sb.toString();

    }

}
