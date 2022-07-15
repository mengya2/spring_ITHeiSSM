package com.itzww.dao;


import com.itzww.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.Scope;

import java.util.List;

public interface BookDao {

    /**
     * 添加
     * @param book
     */
    @Insert("insert into tbl_book(type,name,description) values(#{type},#{name},#{description})")
    public void save(Book book);

    /**
     * 修改
     * @param book
     */
    @Update("update tbl_book set type =#{type},name = #{name}, description =  #{description} where id = #{id}")
    public void update(Book book);

    /**
     * 删除
     * @param id
     */
    @Delete("delete from tbl_book where id = #{id}")
    public void delete(Integer id);

    @Select("select * from tbl_book where id = #{id} ")
    public Book getById(Integer id);

    /**
     * 获取所有的
     * @return
     */
    @Select("select * from tbl_book")
    public List<Book> getAll();
}
