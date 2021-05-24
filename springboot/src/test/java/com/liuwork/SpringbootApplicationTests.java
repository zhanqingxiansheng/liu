package com.liuwork;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootConfiguration(classes = MockServletContext.class)
@SpringBootTest
class SpringbootApplicationTests {
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception{
        Object[] controllers;
//        mvc = MockMvcBuilders.standaloneSetup(new controllers).build();
    }
    @Test
    void contextLoads() {
    }

}
