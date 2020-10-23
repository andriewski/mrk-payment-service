package by.mark.paymentservice.service;

import by.mark.paymentservice.api.PaymentService;
import by.mark.paymentservice.model.Payment;
import by.mark.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.ObjectNotFoundException;

import java.util.UUID;

@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment getPaymentById(UUID id) {
        return paymentRepository
                .findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, Payment.class.getSimpleName()));
    }
}
