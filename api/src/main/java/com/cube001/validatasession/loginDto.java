package com.cube001.validatasession;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Author:张向宇
 * @Description:
 * @Date:Create in 14:56 2018/06/23
 odified By:
 */
@Data
public class loginDto {
    /**
     * 手机号
     * */
    @Pattern(regexp="(?:0|86|\\+86)?1[3456789]\\d{9}",message = "{login.phoneValidate.Err}")
    @NotBlank
    @Size(min=11,max=11,message="{login.phoneValidate.size}")
    private String phone;

    /**
     * 图形验证码
     * */
    @NotBlank
    private String picCaptcha;

    /**
     * 密码
     * */
    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$",message = "密码必须是8-20位的数字和字母的组合")
    private String password;
}
