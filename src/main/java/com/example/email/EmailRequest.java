package com.example.email;

import lombok.Data;

@Data
public class EmailRequest {
    private String[] recipients;
    private String subject;
    private String body;
}
