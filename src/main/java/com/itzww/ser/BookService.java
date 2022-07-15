package com.itzww.ser;

import com.itzww.domain.Book;
import java.util.List;

/**
 * 业务层接口
 */
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);
    public List<Book> getAll();
}
