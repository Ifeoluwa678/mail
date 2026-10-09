package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MailController {

    @Autowired
    private MailService mailService;


    @PostMapping("/sendMessage")
    public String sendEmail(@RequestBody EmailRequest request) {

        return mailService.sendEmail(request);
    }
}
