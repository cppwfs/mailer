package io.spring.mailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailerApplication.class, args);
	}


}
