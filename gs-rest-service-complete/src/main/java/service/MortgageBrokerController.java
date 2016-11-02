package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MortgageBrokerController {

	
	@RequestMapping("/endpoint")
	public String service(@RequestParam(value="inp",defaultValue="TEST") String name){
	    return 	"{ name:"+name+"}";
			
	}
    
}
