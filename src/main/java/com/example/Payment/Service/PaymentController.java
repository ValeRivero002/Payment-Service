package com.example.Payment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public String processPayment(@RequestParam String cardNumber,
                                 @RequestParam String cvv,
                                 @RequestParam String expirationDate,
                                 @RequestParam double amount) {
        return paymentService.processPayment(cardNumber, cvv, expirationDate, amount);
    }
}
