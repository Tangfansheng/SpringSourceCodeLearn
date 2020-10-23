package com.ordo.controller;

import com.ordo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
@Lazy
public class BookController {
    @Autowired
    BookService bookService;
}
