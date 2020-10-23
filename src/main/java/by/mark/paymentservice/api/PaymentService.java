package by.mark.paymentservice.api;

import by.mark.paymentservice.model.Payment;

import java.util.UUID;

public interface PaymentService {

    Payment createPayment(Payment payment);

    Payment getPaymentById(UUID id);
}
