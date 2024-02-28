package workContract.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}

    public HourContract(Date date, Double valuePerHour,Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
        return this.valuePerHour * hours;
    }
}
