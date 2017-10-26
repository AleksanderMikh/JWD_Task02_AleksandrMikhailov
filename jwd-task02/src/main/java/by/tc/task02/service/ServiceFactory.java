package by.tc.task02.service;

import by.tc.task02.service.impl.EssenceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final EssenceService essenceService = new EssenceServiceImpl();

	private ServiceFactory() {}

	public EssenceService getEssenceService() {
		return essenceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
