package org.cloud.demo.helloword;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

	@Value("${app.hello}")
	String bar;
	
	@RequestMapping("/")
	String hello(){
		return "This is " + bar;
	}
}
