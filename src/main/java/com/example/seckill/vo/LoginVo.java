package com.example.seckill.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author by liuguangjin
 * @Description 接收登陆对象
 * @Date 21/5/21
 */
@Data
public class LoginVo {
    @NotNull
    private String mobile;
    @NotNull
    private String password;
}
