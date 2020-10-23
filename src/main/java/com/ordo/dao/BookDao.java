package com.ordo.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class BookDao {
    public BookDao(){
        System.out.println("创建BookDao..");
    }

}
