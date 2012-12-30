package com.trading;

import com.trading.dao.UserStrategyDao;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * @author arun
 */
@Repository
public class UserStrategyDaoImpl extends BaseDaoImpl<UserStrategy> implements UserStrategyDao {
    public UserStrategyDaoImpl() {
        super(UserStrategy.class);
    }

    @Override
    public List<UserStrategy> get(Long userId) {
        Query query = entityManager.createQuery("select us from UserStrategy us where userId = :userId");
        query.setParameter("userId", userId);
        return query.getResultList();
    }
}
