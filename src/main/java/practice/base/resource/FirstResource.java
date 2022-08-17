package practice.base.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstResource {
	
	@GetMapping("/get")
	String getFirst() {
		return "First Get Reqeust with GetMapping";
	}
	
	@RequestMapping(value = "/check" , method = RequestMethod.GET)
	String check(){
		return "check with RequestMapping";
	}
	
	@RequestMapping(value = "/manageCicd" , method = RequestMethod.GET)
	String manageCicd(){
		return "check with RequestMapping for mangeCicd";
	}
	

}
