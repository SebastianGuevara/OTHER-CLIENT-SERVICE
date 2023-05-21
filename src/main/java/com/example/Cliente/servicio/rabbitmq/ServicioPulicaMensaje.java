package com.example.Cliente.servicio.rabbitmq;

import com.example.Cliente.controller.dto.SaleDTO;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class ServicioPulicaMensaje{
    private RabbitTemplate rabbitTemplate;

    public ServicioPulicaMensaje(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarMensaje(String sale){
        rabbitTemplate.convertAndSend("direction-router","bogota",sale);

    }
}
