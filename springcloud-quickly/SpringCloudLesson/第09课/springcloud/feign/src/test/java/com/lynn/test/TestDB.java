package com.lynn.test;

import com.lynn.feign.ApiService;
import com.lynn.feign.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDB {

    @Autowired
    private ApiService apiService;

    @Test
    public void test() {
        System.out.println(apiService.index());
    }
}
