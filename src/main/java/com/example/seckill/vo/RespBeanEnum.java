package com.example.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author by liuguangjin
 * @Description 枚举类
 * @Date 21/5/21
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务器异常");

    private final Integer code;
    private final String message;
}
