package com.example.mq.amqp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("RBConfig")
public class Config {
	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange("fanoutExchange");
	}

	@Bean
	public Queue rbqueue() {
		return new Queue("rbqueue");
	}

	@Bean
	public Queue rbtopic() {
		return new Queue("rbtopic");
	}

	@Bean
	public Queue rbtopic2() {
		return new Queue("rbtopic2");
	}

	@Bean
	Binding bindingExchange(Queue rbtopic, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(rbtopic).to(fanoutExchange);
	}

	@Bean
	Binding bindingExchange2(Queue rbtopic2, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(rbtopic2).to(fanoutExchange);
	}
}
