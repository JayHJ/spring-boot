package cn.jayhe.springbootcommandline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("start service");
		SpringApplication.run(Application.class, args);
		System.out.println("start service end");
	}
}
