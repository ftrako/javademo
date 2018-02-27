package com.example.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	@Async
	public void asyncPrint(int number) {
		System.out.println("async number=" + number);
	}

	public void syncPrint(int number) {
		System.out.println("sync number = " + number);
	}
}
