package com.example.dao;

import com.example.pojo.User;

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
    List<User> findAll();

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * @param user
     * @return
     */
    Integer updateUser(User user);
}
