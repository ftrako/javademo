package com.example.mq.amqp;//package com.example.mq.activemq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RBTopicReceiver2 {
	@RabbitListener(queues = "rbtopic2")
	public void receiveMessage(String msg) {
		System.out.println("RB接收到消息2：" + msg);
	}
}
