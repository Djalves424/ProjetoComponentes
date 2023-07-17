package com.devsuperior.ProjetoComponentes.services;

import com.devsuperior.ProjetoComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double calculateTotalValue(Order order) {
        double valueDiscount = order.getBasic() * (order.getDiscount() / 100);
        double valueWithDiscount = order.getBasic() - valueDiscount;
        double valueShipping = ShippingService.calculateShipping(valueWithDiscount);
        return valueWithDiscount + valueShipping;
    }
}

