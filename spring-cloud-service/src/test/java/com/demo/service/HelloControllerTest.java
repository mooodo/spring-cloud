package com.demo.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {
    @Autowired
    private HelloController controller;
    @Test
    public void testSayHello() {
        String user = "John";
        String result = controller.sayHello(user);
        assertThat(result, equalTo("Hi John, welcome to you! The server port is -1"));
    }
}
