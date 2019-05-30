package org.vincent.springbootstudy.service.impl;

import org.springframework.stereotype.Service;
import org.vincent.springbootstudy.domain.UserLogin;
import org.vincent.springbootstudy.service.LoginService;

/**
 * @author PengRong
 * @package org.vincent.springbootstudy.service.impl
 * @ClassName LoginServiceImpl.java
 * @date 2019/5/30 - 21:37
 * @ProjectName springbootstudy
 * @Description: 登入服务
 */
@Service(value = "loginService")
public class LoginServiceImpl implements LoginService{
    @Override
    public boolean login(UserLogin userLogin) {
        System.out.println(userLogin.toString()+ " login in ");
        return true;
    }

    @Override
    public boolean logout(UserLogin userLogin) {
        System.out.println(userLogin.toString()+ " logout. ");
        return true;
    }
}
