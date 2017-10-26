package by.tc.task02.dao.impl;

import by.tc.task02.entity.Essence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreeMaker {

    private Pattern tagPattern = Pattern.compile("(\\w+[=]\\W*\\w+\\W)|(\\w+)");
    private Matcher match;

    public Essence addEssense(Essence essence, String entry) {
        Essence newEssence = new Essence();
        String name = "",
                attributes = "";

        match = tagPattern.matcher(entry);
        while(match.find()) {
            if(match.group(2)!= null) {
                  name = match.group(2);
            }
            else if (match.group(1)!= null) {
                attributes = attributes + match.group(1) + " ";
            }
        }
        newEssence.setEssenceName(name);
        newEssence.setAttributs(attributes);
        newEssence.setParent(essence);
        essence.getListOfEssences().add(newEssence);
        return  newEssence;
    }

///////////////////////////////////////////////////////////////

    public Essence stepBack(Essence essence) {
        return essence.getParent();
    }

//////////////////////////////////////////////////////////////

    public void addData(Essence essence, String entry) {
        essence.setData(entry);
    }
}
