package com.example.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class FunctionService implements ResourceLoaderAware {
	private ResourceLoader loader = null;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	public void printTextFile(String path) {
		try {
			Resource resource = loader.getResource(path);
			String text = IOUtils.toString(resource.getInputStream());
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
