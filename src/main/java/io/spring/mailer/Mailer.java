package io.spring.mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import java.io.IOException;

public class Mailer {
    private JavaMailSender javaMailSender;

    public Mailer(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    void sendEmail() throws MessagingException, IOException {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("1@gmail.com", "2@yahoo.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

    }
}
