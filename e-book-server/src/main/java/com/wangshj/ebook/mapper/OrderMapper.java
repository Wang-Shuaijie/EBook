package com.wangshj.ebook.mapper;

import com.wangshj.ebook.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/8/1 10:22
 * @description:
 */
@Repository
public interface OrderMapper {
    /**
     * 获取全部订单
     *
     * @return
     */
    List<Order> getAllOrders();

    /**
     * 根据过滤条件查找订单
     *
     * @param filter
     * @return
     */
    List<Order> searchOrder(String filter);

    /**
     * 查找用户的所有订单
     *
     * @param account
     * @return
     */
    List<Order> getOrder(String account);

    int setStock(String ISBN, int stock);

    int maxID();

    int selectStock(String ISBN);

    void addOrder(Order order);

    void addOrderItem(Order order);

    List<Order> dateFilter(String beginDate, String endDate, String account);

    List<Order> dateDetailFilter(String beginDate, String endDate, String account);

}
