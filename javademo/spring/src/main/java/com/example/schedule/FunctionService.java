package com.example.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FunctionService {
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");

	@Scheduled(fixedRate = 2000)
	public void printCurrentTime() {
		System.out.println(dateFormat.format(new Date()));
	}
}
