package taxManagement.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxCompany = 0.0;
        if (this.numberOfEmployees > 10) {
            taxCompany = this.getAnnualIncome() * 0.14;
        } else {
            taxCompany = this.getAnnualIncome() * 0.16;
        }
        return taxCompany;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(": ");
        sb.append("$ ").append(String.format("%.2f",this.tax()));

        return sb.toString();
    }
}
