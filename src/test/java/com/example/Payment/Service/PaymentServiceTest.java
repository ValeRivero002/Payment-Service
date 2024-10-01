package com.example.Payment.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentServiceTest {

    @Test
    public void testProcessPayment() {
        PaymentService paymentService = new PaymentService();

        // Caso exitoso
        assertEquals("Payment of 500.0 processed successfully.",
                paymentService.processPayment("1234567812345678", "123", "12/25", 500.0));

        // Caso con monto inválido
        assertEquals("Invalid payment details.",
                paymentService.processPayment(null, "123", "12/25", -50.0));

        // Caso con monto excesivo
        assertEquals("Payment declined: Amount exceeds limit.",
                paymentService.processPayment("1234567812345678", "123", "12/25", 1500.0));
    }
}
