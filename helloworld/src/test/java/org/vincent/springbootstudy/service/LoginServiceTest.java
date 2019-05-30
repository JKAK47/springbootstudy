package org.vincent.springbootstudy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.vincent.springbootstudy.domain.UserLogin;

/**
 * @author PengRong
 * @package org.vincent.springbootstudy.service
 * @ClassName LoginServiceTest.java
 * @date 2019/5/30 - 21:44
 * @ProjectName springbootstudy
 * @Description: 服务类 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {
    @Autowired
    private LoginService loginService;

    @Test
    public void contextLoads() {
        UserLogin userlogin = new UserLogin();
        userlogin.setPassword("1234456");
        userlogin.setUserid("asdfasd");
        boolean login = loginService.login(userlogin);
        System.out.println(login);
        login = loginService.logout(userlogin);
        System.out.println(login);

    }

}
