package com.example.mq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MQTopicReceiver2 {
	@JmsListener(destination = "mytopic", containerFactory = "jmsListenerContainerTopic")
	public void receiveMessage(String msg) {
		System.out.println("接收到消息2：" + msg);
	}
}
