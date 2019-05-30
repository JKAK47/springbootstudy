package org.vincent.springbootstudy.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.vincent.springbootstudy.domain.UserLogin;

/**
 * @author PengRong
 * @package org.vincent.springbootstudy.controller
 * @ClassName HelloControllerTes.java
 * @date 2019/5/30 - 21:49
 * @ProjectName springbootstudy
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTes {
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    /**
     *  该controller 方法里面依赖的 服务报空指针， 如果需要mock 测试，怎么办？
     *  controller 方法实现传递 url 参数
     *  body 结构 数据
     * @throws Exception
     */
    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/index")
                .param("index","2343asd")
                .content("{\"userid\":\"11144333\",\"password\":\"passwosdfasrd\"}")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /**
     * 传参只有url 参数时候怎么传递参数
     * @throws Exception
     */
    @Test
    public void nametest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/name")
                .param("name","2343asd")
                //.content("{\"userid\":\"11144333\",\"password\":\"passwosdfasrd\"}")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /**
     * 传参只有 参数体时候怎么传参数
     * @throws Exception
     */
    @Test
    public void bodyTest() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post("/body")
                //.param("name","2343asd")
                .content("{\"userid\":\"11144333\",\"password\":\"passwosdfasrd\"}")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())

                .andReturn();
        System.out.println(mvcResult);
    }

    @After
    public void close(){
        System.out.println("after ");
    }

}
