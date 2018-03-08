package com.example.mq.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

@Component
public class MQSender {
	@Autowired
	private Queue queue;

	@Autowired
	private Topic topic;

	@Autowired
	private JmsMessagingTemplate messagingTemplate;

	public void send() {
		for (int loop = 0; loop < 10; loop++) {
			messagingTemplate.convertAndSend(queue, "queue msg " + loop);
		}

		for (int loop = 0; loop < 10; loop++) {
			messagingTemplate.convertAndSend(topic, "topic msg " + loop);
		}
	}
}
