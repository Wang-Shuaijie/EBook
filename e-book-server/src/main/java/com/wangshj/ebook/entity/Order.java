package com.wangshj.ebook.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author: wangshjm
 * @date: 2020/7/31 16:00
 * @description:
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {
    private Integer id;
    private String account;
    private String userName;
    private String bookName;
    private String author;
    private String ISBN;
    private String cover;
    private Float price;
    private Integer count;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp date;
    private Float amount;
}
