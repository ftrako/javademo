package com.example.mq.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RBQueueReceiver {
	@RabbitListener(queues = "rbqueue")
	public void receiveMessage(String msg) {
		System.out.println("RB接收到消息：" + msg);
	}
}
