package clientOrder.application;

// Read data from an order with N items (N provided by the user).
// Then show a order summary.
//
// Ler os dados de um pedido com N itens (N fornecido pelo usuário).
// Depois, mostrar um sumário do pedido.


import clientOrder.entities.Client;
import clientOrder.entities.Order;
import clientOrder.entities.OrderItem;
import clientOrder.entities.Product;
import clientOrder.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime timeStamp = LocalDateTime.now();



        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Email: ");
        String email = reader.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(reader.nextLine(),fmt1);
        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        String orderStatus = reader.nextLine();
        System.out.print("\nHow many items to this order? ");
        int amountItem = reader.nextInt();
        reader.nextLine();

        Order order1 = new Order(timeStamp, OrderStatus.valueOf(orderStatus),new Client(name, email,birthDate));


        for(int i = 1; i <= amountItem;i++){
            System.out.println("\nEnter #"+i+" item data:");
            System.out.print("Product name: ");
            String productName = reader.nextLine();
            System.out.print("Product price: ");
            double productPrice = reader.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = reader.nextInt();
            reader.nextLine();

            OrderItem orderItem1 = new OrderItem(productQuantity,productPrice,new Product(productName,productPrice));
            order1.addItem(orderItem1);
        }


        System.out.println(order1);

        reader.close();
    }
}
