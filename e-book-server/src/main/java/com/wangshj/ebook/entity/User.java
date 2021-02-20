package com.wangshj.ebook.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/7/31 16:00
 * @description:
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String account;
    private String password;
    private String name;
    private String code;
    private Boolean allowed;
    private Boolean isManager;
    private String mail;

}
