package com.example.springmvc.api;


import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/v1/api")
public class FileController {
	@RequestMapping(value = "/uploadText", method = RequestMethod.POST)
	public String uploadText(MultipartFile file) {
		try {
			String text = IOUtils.toString(file.getInputStream());
			System.out.println(text);
			return "ok";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "fail";
	}
}
