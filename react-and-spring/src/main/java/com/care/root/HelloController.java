package com.care.root;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@CrossOrigin
@RestController
public class HelloController {

	@GetMapping("/api/hello")
	public String hello(){
		return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
	}
}
