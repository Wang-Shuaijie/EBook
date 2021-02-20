package com.wangshj.ebook.entity;

import lombok.Data;

/**
 * @author: wangshjm
 * @date: 2020/7/31 16:00
 * @description:
 */
@Data
public class LoginState {
    private Boolean isLogin;
    private Integer code;
    private String account;
    private String name;
    private String message;
}
