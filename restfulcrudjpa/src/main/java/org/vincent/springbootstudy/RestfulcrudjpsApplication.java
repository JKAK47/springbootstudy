package org.vincent.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class RestfulcrudjpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulcrudjpsApplication.class, args);
	}
	@RequestMapping(path = "/")
	public String index(){
		return "hello Restful.";
	}

}
