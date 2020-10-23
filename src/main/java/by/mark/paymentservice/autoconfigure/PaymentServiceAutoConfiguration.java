package by.mark.paymentservice.autoconfigure;

import by.mark.paymentservice.api.PaymentService;
import by.mark.paymentservice.repository.PaymentRepository;
import by.mark.paymentservice.service.PaymentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentServiceAutoConfiguration {

    @Bean
    PaymentService userService(PaymentRepository paymentRepository) {
        return new PaymentServiceImpl(paymentRepository);
    }
}
