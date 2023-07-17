package com.devsuperior.ProjetoComponentes;

import com.devsuperior.ProjetoComponentes.entities.Order;
import com.devsuperior.ProjetoComponentes.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoComponentesApplication implements CommandLineRunner {
    
    public static void main(String[] args) {
        SpringApplication.run(ProjetoComponentesApplication.class, args);

        OrderService orderService = new OrderService();

        System.out.println("___________________________________________");

        Order order1 = new Order(1034, 150.0, 20.0);
        double amount1 = orderService.calculateTotalValue(order1);
        System.out.println("Pedido código " + order1.getCode());
        System.out.println("Valor total: R$ " + amount1);

        System.out.println("___________________________________________");

        Order order2 = new Order(2282, 800.0, 10.0);
        double amount2 = orderService.calculateTotalValue(order2);
        System.out.println("Pedido código " + order2.getCode());
        System.out.println("Valor total: R$ " + amount2);

        System.out.println("___________________________________________");

        Order order3 = new Order(1309, 95.9, 0.0);
        double amount3 = orderService.calculateTotalValue(order3);
        System.out.println("Pedido código " + order3.getCode());
        System.out.println("Valor total: R$ " + amount3);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

