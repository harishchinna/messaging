package com.app.rabbit.messaging.controller;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private RabbitMessagingTemplate template;

	String message = "Hello World";

	@GetMapping
	public void send() {
		template.convertAndSend("CustomerQ", message);
	}
}
