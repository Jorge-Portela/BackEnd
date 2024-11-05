package order.entities;

import java.util.Date;
import order.entities.enums.OrderStatus;
public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(){}

    public Order( Date moment, OrderStatus status){
        int count = 0;
        count ++;
        this.id = count;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }


    public Date getMoment(){
        return this.moment;
    }

    public void setMoment(Date moment){
        this.moment = moment;
    }


    public OrderStatus getStatus(){
        return this.status;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public String toString(){
        return  "Order: "
                +"ID = "
                + getId()
                + " | MOMENT = "
                + getMoment()
                + " | STATUS = "
                + getStatus();
    }

}



