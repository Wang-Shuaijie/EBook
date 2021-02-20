package com.wangshj.ebook.service.impl;

import com.wangshj.ebook.entity.LoginState;
import com.wangshj.ebook.entity.User;
import com.wangshj.ebook.mapper.UserMapper;
import com.wangshj.ebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/8/1 10:45
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void create(String account, String password, String name, String mail) {
        userMapper.createUser(account, password, name, true, false, mail);
    }

    @Override
    public void create(String account, String password, String name, Boolean allowed, Boolean isManager, String mail) {
        userMapper.createUser(account, password, name, allowed, isManager, mail);
    }

    @Override
    public User getUser(String account) {
        User user = userMapper.getUser(account);
        return user;
    }

    @Override
    public LoginState getLoginState(String account, String password) {
        LoginState state = new LoginState();
        User user;

        user = userMapper.getLoginState(account, password);

        if (user == null){
            state.setIsLogin(false);
            state.setCode(0);
            state.setMessage("用户名密码错误");
        } else {
            if (user.getAllowed()) {
                if (user.getIsManager()) {
                    state.setIsLogin(true);
                    state.setCode(1);
                    state.setName(user.getName());
                    state.setAccount(user.getAccount());
                    state.setMessage("用户存在，为管理员");
                } else {
                    state.setIsLogin(true);
                    state.setCode(0);
                    state.setName(user.getName());
                    state.setAccount(user.getAccount());
                    state.setMessage("用户存在，为普通用户");
                }
            } else {
                state.setIsLogin(false);
                state.setCode(1);
                state.setMessage("用户被禁用");
            }
        }

        return state;
    }

    @Override
    public int banUser(String account) {
        int rows = userMapper.changeUser(false, account);
        return rows;
    }

    @Override
    public int allowUser(String account) {
        int rows = userMapper.changeUser(true, account);
        return rows;
    }

    @Override
    public List<User> getUserStates() {
        List<User> userStates;
        userStates = userMapper.getUserState();
        return userStates;
    }

    @Override
    public Boolean ifExist(String account, String mail) {
        User user = userMapper.getUser(account);
        if (user != null) {
            return true;
        } else {
            user = userMapper.getUserWithMail(mail);
            if (user != null) {
                return true;
            } else {
                return false;
            }
        }
    }
}
