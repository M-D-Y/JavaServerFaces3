package hello;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class GreetingService {

	@Inject Greeting2 greeting;
	public String getGreet(){
		return this.greeting.getGreet("my friend");
	}
	
}
