package by.tc.task02.dao;

import by.tc.task02.dao.impl.EssenceDAOImpl;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final EssenceDAO essenceDAO = new EssenceDAOImpl();
	private DAOFactory() {}

	public EssenceDAO getEssenceDAO() {
		return essenceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
