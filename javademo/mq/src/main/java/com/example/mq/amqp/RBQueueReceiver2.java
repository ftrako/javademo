package com.example.mq.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RBQueueReceiver2 {
	@RabbitListener(queues = "rbqueue")
	public void receiveMessage(String msg) {
		System.out.println("RB接收到消息2：" + msg);
	}
}
