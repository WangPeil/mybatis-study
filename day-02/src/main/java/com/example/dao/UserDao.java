package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author peili.wang
 * @date 2020/2/25 22:03
 */
public interface UserDao {
    /**
     * 查询所有
     *
     * @return 所有
     */
    @Select("select * from user")
    List<User> findAll();
}
