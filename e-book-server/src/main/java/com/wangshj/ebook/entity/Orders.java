package com.wangshj.ebook.entity;

import lombok.Data;

import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/7/31 16:00
 * @description:
 */
@Data
public class Orders {
    private List<Order> orderItems;
}
