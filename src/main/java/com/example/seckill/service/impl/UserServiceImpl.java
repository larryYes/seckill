package com.example.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.seckill.mapper.UserMapper;
import com.example.seckill.pojo.User;
import com.example.seckill.service.IUserService;
import com.example.seckill.utils.MD5Util;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.vo.RespBean;
import com.example.seckill.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuguangjin
 * @since 2021-05-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public RespBean doLogin(LoginVo loginVo) {
        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();

        User user = this.getById(mobile);

        if (null==user){
            return RespBean.error(RespBeanEnum.ERROR);
        }
        if (!MD5Util.formPassToDbPass(password,user.getSlat()).equals(user.getPassword())){
            return RespBean.error(RespBeanEnum.ERROR);
        }

        return RespBean.success();
    }
}
