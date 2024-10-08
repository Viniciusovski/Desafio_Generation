package desafio.generation.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ApiApplication {

	@GetMapping
	public ModelAndView swaggerUi() {
		return new ModelAndView("redirect:swagger-ui/index.html");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
