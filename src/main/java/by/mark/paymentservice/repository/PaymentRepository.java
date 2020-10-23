package by.mark.paymentservice.repository;

import by.mark.paymentservice.model.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentRepository extends CrudRepository<Payment, UUID> {
}
