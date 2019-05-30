package org.vincent.springbootstudy.service;

import org.vincent.springbootstudy.domain.UserLogin;

/**
 * @author PengRong
 * @package org.vincent.springbootstudy.service
 * @ClassName LoginService.java
 * @date 2019/5/30 - 21:36
 * @ProjectName springbootstudy
 * @Description: TODO
 */
public interface LoginService {
    public boolean login(UserLogin userLogin);
    public boolean logout(UserLogin userLogin);
}
