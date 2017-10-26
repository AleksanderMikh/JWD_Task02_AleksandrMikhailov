package by.tc.task02.main;

import by.tc.task02.entity.Essence;

public class PrintEssenceInfo {
    public String printEssenceInfo(Essence essence) {
        String data = "";
        if(essence == null) {
            return null;
        }
        for (Essence es : essence.getListOfEssences()) {
            data = "";
            data = es.getData();
            if (es.getListOfEssences().isEmpty()) {
                return es.getData() + "\n";
            }
            data = data + " " + printEssenceInfo(es);
        }
        return data;
    }

}
