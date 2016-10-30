package hello;

import javax.inject.Named;

@Named
public class Greeting1 {
	
	public String getGreet() {
		return "Hello, my friend, without injection";
	}
}
