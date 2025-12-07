package com.marvellous.SmallApp;

import org.springframework.stereotype.Component;

@Component
public class MessageService
{
    public String getInfoMessage()
    {
        return "Learning Spring Boot with Marvellous !";
    }
}
