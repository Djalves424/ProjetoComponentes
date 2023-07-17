package com.devsuperior.ProjetoComponentes.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public static double calculateShipping(double baseValue) {
        if (baseValue < 100.0) {
            return 20.0;

        } else if (baseValue < 200.0) {
            return 12.0;

        } else {
            return 0.0;
        }
    }
}

