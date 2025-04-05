package com.example.Spring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dekstop implements Computer {
    public void compile(){
        System.out.println("compiling in dekstop");
    }
}
