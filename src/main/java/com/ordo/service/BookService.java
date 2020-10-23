package com.ordo.service;

import com.ordo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public BookService(BookDao bookDao){
        System.out.println("有参构造器");
        this.bookDao = bookDao;
    }

    public BookService(){
        System.out.println("无参构造器");
    }

    public void print(){
        System.out.println("bookdao :" + bookDao);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("0001");
        sb.reverse();
        System.out.println(sb.toString());
    }

}
