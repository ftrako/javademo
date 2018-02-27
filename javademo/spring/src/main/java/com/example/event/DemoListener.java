package com.example.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoBean> {
	public void onApplicationEvent(DemoBean demoBean) {
		System.out.println("接收到消息 " + demoBean.msg);
	}
}
