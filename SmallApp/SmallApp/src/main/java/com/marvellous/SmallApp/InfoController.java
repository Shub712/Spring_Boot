package com.marvellous.SmallApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController
{
    @Autowired
    private MessageService messageService;

    // GET : /info
    @GetMapping("/info")
    public String getInfo()
    {
        return messageService.getInfoMessage();
    }
}
