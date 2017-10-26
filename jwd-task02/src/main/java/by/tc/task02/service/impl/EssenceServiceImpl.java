package by.tc.task02.service.impl;

import by.tc.task02.dao.EssenceDAO;
import by.tc.task02.dao.DAOFactory;
import by.tc.task02.entity.Essence;
import by.tc.task02.service.EssenceService;

public class EssenceServiceImpl implements EssenceService{
	@Override
	public Essence makeEssence() {
		
		DAOFactory factory = DAOFactory.getInstance();
		EssenceDAO essenceDAO = factory.getEssenceDAO();

		Essence essence = essenceDAO.makeEssence();
		
		return essence;
	}

}

//you may add your own new classes
