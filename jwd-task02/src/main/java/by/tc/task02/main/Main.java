package by.tc.task02.main;

import by.tc.task02.entity.Essence;
import by.tc.task02.service.EssenceService;
import by.tc.task02.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Essence essence; //Создаем объект класса Appliance - базовый класс для техники
		PrintEssenceInfo printer = new PrintEssenceInfo();
		ServiceFactory factory = ServiceFactory.getInstance();
		EssenceService service = factory.getEssenceService();

		essence = service.makeEssence();
		System.out.println(printer.printEssenceInfo(essence));

	}

}
