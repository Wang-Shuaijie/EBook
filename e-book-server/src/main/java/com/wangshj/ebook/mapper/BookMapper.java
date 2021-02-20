package com.wangshj.ebook.mapper;

import com.wangshj.ebook.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wangshjm
 * @date: 2020/8/1 10:22
 * @description:
 */
@Repository
public interface BookMapper {
    /**
     * 根据ISBN号查找书籍
     *
     * @param ISBN
     * @return
     */
    Book getBook(String ISBN);

    /**
     * 获取全部书籍
     *
     * @return
     */
    List<Book> getBooks();

    /**
     * 根据过滤条件查找书籍
     *
     * @param filter
     * @return
     */
    List<Book> searchBooks(String filter);

    int deleteBook(String ISBN);

    void addBook(Book book);

    int modifyBook(Book book);

    Book getDetail(String ISBN);
}
