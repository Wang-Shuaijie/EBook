package com.wangshj.ebook.mapper;

import com.wangshj.ebook.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/8/1 10:23
 * @description:
 */
@Repository
public interface UserMapper {
    /**
     * 根据账号查找用户
     *
     * @param account
     * @return
     */
    User getUser(String account);

    /**
     * 获取登录状态
     *
     * @param account
     * @param password
     * @return
     */
    User getLoginState(String account, String password);

    int changeUser(Boolean allowed, String account);

    void createUser(String account, String password, String name, Boolean allowed, Boolean isManager, String mail);

    List<User> getUserState();

    User getUserWithMail(String mail);
}
