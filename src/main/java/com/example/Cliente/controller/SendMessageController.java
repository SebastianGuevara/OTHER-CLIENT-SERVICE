package com.example.Cliente.controller;

import com.example.Cliente.controller.dto.SaleDTO;
import com.example.Cliente.servicio.rabbitmq.ServicioPulicaMensaje;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SendMessageController {
    private final ServicioPulicaMensaje servicioPulicaMensaje;

    public SendMessageController(ServicioPulicaMensaje servicioPulicaMensaje) {
        this.servicioPulicaMensaje = servicioPulicaMensaje;
    }

    @PostMapping("/product")
    public ResponseEntity<String> sellProduct(@RequestBody SaleDTO saleDTO){
        try{
            Gson gson = new Gson();
            String saleJson = gson.toJson(saleDTO);
            servicioPulicaMensaje.enviarMensaje(saleJson);
            return new ResponseEntity("Message sent", HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity("Message error", HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
}
