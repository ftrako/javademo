package com.example.mq.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class MQTopicReceiver {
	@Autowired
	private Topic topic;

	@JmsListener(destination = "mytopic", containerFactory = "jmsListenerContainerTopic")
	public void receiveMessage(String msg) {
		System.out.println("接收到消息：" + msg);
	}
}
