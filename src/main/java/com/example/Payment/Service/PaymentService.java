package com.example.Payment.Service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String cardNumber, String cvv, String expirationDate, double amount) {
        // Aquí iría la lógica para procesar el pago.
        // Para fines de simulación, simplemente devolvemos un mensaje.

        // Validaciones básicas
        if (cardNumber == null || cvv == null || expirationDate == null || amount <= 0) {
            return "Invalid payment details.";
        }

        // Simulación de procesamiento de pago
        if (amount > 1000) {
            return "Payment declined: Amount exceeds limit.";
        }

        return "Payment of " + amount + " processed successfully.";
    }
}
