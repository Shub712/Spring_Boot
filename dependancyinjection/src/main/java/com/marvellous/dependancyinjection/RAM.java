package com.marvellous.dependancyinjection;

import org.springframework.stereotype.Component;

@Component
public class RAM
{
    public String RAMDisplay()
    {
        return "RAM is of 16 GB";
    }
}
