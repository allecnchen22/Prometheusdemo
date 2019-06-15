package test.allen.Prometheusdemo;

import javax.xml.ws.http.HTTPException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("sayhello")
	public String SayHello() {
		
		return "Hello";
		
	}
	
	@RequestMapping("makingerror")
	public String MakingError() {
		
		throw new HTTPException(500);
		
	}
	
	
	@RequestMapping("5sec")
	public String FiveSec() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "OK";
		
	}

}
