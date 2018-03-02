package com.example.springboot.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
	@MessageMapping("/welcome")
	@SendTo("/topic/response")
	public String say(String username) throws Exception {
		return "welcome " + username + "!";
	}
}
