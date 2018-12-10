package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		
		System.out.println("aaa");
		System.out.println("bbb");
		System.out.println(gwc.getResult());
	}
}
