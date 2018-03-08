package com.example.mq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MQQueueReceiver {
	@JmsListener(destination = "myqueue", containerFactory = "jmsListenerContainerQueue")
	public void receiveMessage(String msg) {
		System.out.println("接收到消息：" + msg);
	}
}
