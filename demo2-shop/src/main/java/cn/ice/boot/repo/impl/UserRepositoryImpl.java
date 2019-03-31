package cn.ice.boot.repo.impl;

import cn.ice.boot.entity.User;
import cn.ice.boot.repo.UserRepositoryEx;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryEx {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<User> findTopUser(int max) {
        Query query = this.entityManager.createQuery("from User");
        query.setMaxResults(max);
        return query.getResultList();
    }
}
