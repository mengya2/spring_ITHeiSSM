package com.zww.test;


import com.itzww.config.SpringConfig;
import com.itzww.domain.Book;
import com.itzww.ser.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class MyTest {
    @Autowired
    private BookService bookService;

    @Test
    public void test01(){
        Book book = bookService.getById(2);
        System.out.println(book);
    }

}
