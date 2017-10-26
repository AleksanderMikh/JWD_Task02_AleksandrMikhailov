package by.tc.task02.dao.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MeanOfEntry {

    public static String getMeanOfEntry(String entry,Pattern pattern){
        Matcher m = pattern.matcher(entry);
        String type = "";
        while(m.find()) {
            if (m.group(5) != null) {
                type = "openTag";
            } else if (m.group(3) != null) {
                type = "closeTag";
            } else if (m.group(1) != null) {
                type = "singleTag";
            } else if (m.group(7) != null){
                type = "data";
            }
        }
        return type;
    }
}
