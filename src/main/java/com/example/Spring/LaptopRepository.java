package com.example.Spring;

import com.example.Spring.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public  void save(Laptop lap){
        System.out.println("saved in databse");

    }
}
