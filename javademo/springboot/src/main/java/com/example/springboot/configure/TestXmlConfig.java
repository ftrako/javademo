package com.example.springboot.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:TestXml.xml"})
public class TestXmlConfig {
}
