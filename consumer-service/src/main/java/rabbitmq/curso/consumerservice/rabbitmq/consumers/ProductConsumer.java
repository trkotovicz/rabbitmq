package rabbitmq.curso.consumerservice.rabbitmq.consumers;

import dtos.ProductDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static contants.RabbitMQContants.RK_PRODUCT_LOG;

@Log4j2
@Component
public class ProductConsumer {

    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumer(ProductDTO message) {
        log.info("Received message " + message.toString());
    }
}
