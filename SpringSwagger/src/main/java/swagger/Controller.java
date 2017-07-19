package swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping(method = RequestMethod.GET, value = "/swagger")
	public String sayHello() {
		return "Swagger example";
	}
	
}
