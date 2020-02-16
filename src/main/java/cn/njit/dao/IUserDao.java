package cn.njit.dao;

import cn.njit.domain.User;

import java.util.List;

/**
 * @author 周仕尧
 * @date 2020/2/11 - 15:38
 * 用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有操作
     */
    List<User> findAll();
}
