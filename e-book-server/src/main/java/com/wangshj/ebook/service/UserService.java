package com.wangshj.ebook.service;

import com.wangshj.ebook.entity.LoginState;
import com.wangshj.ebook.entity.User;

import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/8/1 10:44
 * @description:
 */
public interface UserService {
    /**
     * 新增一个用户
     * @param account
     * @param password
     * @param name
     * @param mail
     */
    void create(String account, String password, String name, String mail);

    void create(String account, String password, String name, Boolean allowed, Boolean isManager, String mail);

    /**
     * 获取单个用户数据
     * @param account
     * @return
     */
    User getUser(String account);

    /**
     * 判断用户状态
     * @param account
     * @param password
     * @return
     */
    LoginState getLoginState(String account, String password);

    /**
     * 禁用用户
     * @param account
     * @return
     */
    int banUser(String account);

    /**
     * 解禁用户
     * @param account
     * @return
     */
    int allowUser(String account);

    /**
     * 获得所有用户状态
     * @return
     */
    List<User> getUserStates();

    /**
     * 判断用户是否存在
     * @param account
     * @param mail
     * @return
     */
    Boolean ifExist(String account, String mail);
}
