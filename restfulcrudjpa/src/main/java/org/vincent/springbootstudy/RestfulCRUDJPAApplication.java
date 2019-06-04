package org.vincent.springbootstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vincent.springbootstudy.dao.impl.TUserMapper;
import org.vincent.springbootstudy.dao.model.TUser;
import org.vincent.springbootstudy.dao.model.TUserExample;

import java.util.List;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@RestController
@MapperScan("org.vincent.springbootstudy.dao.impl")
public class RestfulCRUDJPAApplication {

    @Autowired
    private TUserMapper tUserMapper;

    public static void main(String[] args) {
        SpringApplication.run(RestfulCRUDJPAApplication.class, args);
    }

    @RequestMapping(path = "/")
    public String index() {
        /** 访问数据库 */
        TUserExample example = new TUserExample();
        example.createCriteria().andIdEqualTo(1);
        List<TUser> tUsers = tUserMapper.selectByExample(example);
        System.out.println(tUsers);
        return "hello Restful.";
    }

}
