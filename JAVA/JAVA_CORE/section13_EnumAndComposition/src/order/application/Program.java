package order.application;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

import order.entities.Order;
import order.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args){

        Scanner reader =  new Scanner(System.in);

        System.out.println("*** WELCOME TO LIGHT CITY DELIVERY ***");

        Order order1 = new Order(new Date(),OrderStatus.PROCESSING);

        System.out.println(order1);

        OrderStatus order2 = OrderStatus.DELIVERED;

        System.out.println("Order 2 STATUS: " + order2);

        OrderStatus order3 = OrderStatus.valueOf("SHIPPED");

        System.out.println("Order 3 STATUS: " + order3);

        Order order4 = new Order(new Date(),OrderStatus.PENDING_PAYMENT);

        System.out.println("Order 4 STATUS: " + order4);


        reader.close();

    }
}
