package com.example.mq.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RBSender {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send() {
		for (int loop = 0; loop < 10; loop++) {
			rabbitTemplate.convertAndSend("rbqueue", "rbqueue msg " + loop);
		}

		for (int loop = 0; loop < 10; loop++) {
			rabbitTemplate.convertAndSend("fanoutExchange", "", "rbtopic msg " + loop);
		}
	}
}
