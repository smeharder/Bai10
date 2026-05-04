package com.lab;

public class ShippingCalculator {

    public double calculate(double weight, String type) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        
        // Sửa lỗi 2: Dùng "CONSTANT".equals(variable) để an toàn với null
        if ("EXPRESS".equals(type)) return weight * 5000 + 20000;
        if ("STANDARD".equals(type)) return weight * 3000;
        
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
