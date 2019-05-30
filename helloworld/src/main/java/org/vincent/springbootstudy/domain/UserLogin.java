package org.vincent.springbootstudy.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author PengRong
 * @package org.vincent.springbootstudy.domain
 * @ClassName UserLogin.java
 * @date 2019/5/30 - 21:18
 * @ProjectName springbootstudy
 * @Description: TODO
 */
@Data
@Getter
@Setter
@ToString
@Validated
public class UserLogin {
    @NotEmpty
    @Size(min = 8,max = 12,message = "userid 区间在[8,12]")
    private String userid;
    @NotEmpty
    private String password;

}
