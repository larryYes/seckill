package com.example.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.seckill.mapper.OrderMapper;
import com.example.seckill.pojo.Order;
import com.example.seckill.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuguangjin
 * @since 2021-05-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
