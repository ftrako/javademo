package com.example.mq;

//import com.example.mq.activemq.MQSender;

import com.example.mq.activemq.MQSender;
import com.example.mq.amqp.RBSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqApplication implements CommandLineRunner {

	@Autowired
	private MQSender sender;

	@Autowired
	private RBSender rbSender;

	public static void main(String[] args) {
		SpringApplication.run(MqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sender.send();
		rbSender.send();
	}
}
