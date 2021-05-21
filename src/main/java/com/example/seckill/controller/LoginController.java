package com.example.seckill.controller;

import com.example.seckill.service.IUserService;
import com.example.seckill.utils.MD5Util;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 21/5/21
 */
// 页面跳转用Controller
@Controller
@RequestMapping("/login")
// 日志
@Slf4j
public class LoginController {

    @Autowired
    private IUserService userService;

    /**
     * 跳转登陆页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登陆功能
     * @param loginVo
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean doLogin(LoginVo loginVo){
        //模拟前端第一次加密密码
        loginVo.setPassword(MD5Util.inputPassToFormPass(loginVo.getPassword()));
        log.info("{}",loginVo);
        return userService.doLogin(loginVo);
    }
}
