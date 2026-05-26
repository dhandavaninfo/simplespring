package dhanda.van.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/van")
public class VanController {

	@GetMapping("/info")
	public String hello() {
		return "Welcome to Dhandavan Inof..";
	}
}
