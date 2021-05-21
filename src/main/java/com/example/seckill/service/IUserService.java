package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.vo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuguangjin
 * @since 2021-05-21
 */
public interface  IUserService extends IService<User> {

    /**
     * 登陆
     * @param loginVo
     * @return
     */
    RespBean doLogin(LoginVo loginVo);
}
