package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public String sendEmail(EmailRequest request) {
        if (request.getRecipients() == null || request.getRecipients().length >99){
            return "maximum email exceeded or no email is being entered";
        }


        for (String recipient : request.getRecipients()) {
            SimpleMailMessage message = new SimpleMailMessage();


            message.setFrom("ajibadegideon2022@gmail.com");
            message.setTo(recipient);
            message.setSubject(request.getSubject());
            message.setText(request.getBody());
            mailSender.send(message);
        }


        return "Email process finished successfully";
    }
}
