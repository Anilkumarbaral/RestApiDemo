package com.anil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("welcomemsg")
	public String welcomMSg() {
		return "Good morning Anil.....";
	}
	@GetMapping("greetmsg")
	public String greetMsg() {
		return "Hi Anil.....";
	}

}
