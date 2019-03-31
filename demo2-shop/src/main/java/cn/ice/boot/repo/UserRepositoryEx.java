package cn.ice.boot.repo;

import cn.ice.boot.entity.User;

import java.util.List;


/**
 * Extent Repository
 */
public interface UserRepositoryEx {

    List<User> findTopUser(int max);
}
