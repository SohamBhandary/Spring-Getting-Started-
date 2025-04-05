package com.example.Spring;

import com.example.Spring.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.println("method called");

    }
    public boolean isGood(Laptop lap){
        return true;

    }
}
