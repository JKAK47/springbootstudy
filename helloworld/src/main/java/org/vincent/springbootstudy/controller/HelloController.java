package org.vincent.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.vincent.springbootstudy.domain.UserLogin;
import org.vincent.springbootstudy.service.LoginService;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

/**
 * @author PengRong
 * @package org.vincent.springbootstudy.controller
 * @ClassName HelloController.java
 * @date 2019/5/30 - 21:07
 * @ProjectName springbootstudy
 * @Description: 基于 Springboot  controller 案例;
 * RestController 注解的 意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了
 */
@RestController
public class HelloController {
    @Autowired
    @Qualifier(value = "loginService")
    private LoginService loginService;

    @RequestMapping(path = "/index",method = RequestMethod.POST)
    public String index(@RequestParam(required = false) String index, @RequestBody @Valid UserLogin userLogin) {
        System.out.println(userLogin.toString());
        boolean login = loginService.login(userLogin);
        System.out.println(login);
        if (login) {
            login = loginService.logout(userLogin);
            System.out.println(login);
        }
        return "Hello World" + index;
    }

    /**
     * 只有url 参数
     * @param name
     * @return
     */
    @RequestMapping(path = "/name",method = RequestMethod.POST)
    public String index(@RequestParam(required = false) String name ) {

        return "Hello World" + name;
    }

    @RequestMapping(path = "/body",method = RequestMethod.POST)
    public String index(@RequestBody @Valid UserLogin userLogin ) {

        return "Hello World" + userLogin;
    }
}
