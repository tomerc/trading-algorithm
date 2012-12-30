package com.trading;

import com.trading.dao.StrategyDao;
import org.springframework.stereotype.Repository;

@Repository
public class StrategyDaoImpl extends BaseDaoImpl<Strategy> implements StrategyDao {

    public StrategyDaoImpl() {
        super(Strategy.class);
    }

	/*@SuppressWarnings("unchecked")
    @Override
	public List<Strategy> getStrategies(Long userId) {
		Query query = entityManager.createQuery("select s from Strategy swhere s.userId =:userId ");
		query.setParameter("userId", userId);
		return query.getResultList();
		return null;
	}*/


}
