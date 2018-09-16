package com.zym.annotation.service;

import com.zym.annotation.repository.MyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRespository myRespository;

    public void add(){
        System.out.println("Service...");
        myRespository.add();
    }
}
