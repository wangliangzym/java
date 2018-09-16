package com.zym.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("myRespository")
public class MyRespositoryImpl implements MyRespository {
    @Override
    public void add() {
        System.out.println("Repository...");
    }
}
