package vn.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test1Application {

	@GetMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@GetMapping("/{input}")
	public String hello(@PathVariable String input) {
		return "Hello " + input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
