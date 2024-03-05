package clientOrder.entities;

import clientOrder.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    List<OrderItem> orderItemList = new ArrayList<>();

    public Order() {}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addItem(OrderItem item){
        orderItemList.add(item);
    }

    public void removeItem(OrderItem item){
        orderItemList.remove(item);
    }

    public Double total(){
        double sum = 0;
        for(OrderItem o : orderItemList){
            sum += o.subTotal();
        }
        return sum;
    }
}
