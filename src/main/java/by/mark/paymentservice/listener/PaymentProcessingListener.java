package by.mark.paymentservice.listener;

import by.mark.model.Order;
import by.mark.paymentservice.config.KafkaConfig;
import org.springframework.kafka.annotation.KafkaListener;

public class PaymentProcessingListener {

    @KafkaListener(topics = KafkaConfig.PAYMENT_ORDER_QUEUE)
    public void processOrder(Order order) {
        System.out.println(order);
    }
}
