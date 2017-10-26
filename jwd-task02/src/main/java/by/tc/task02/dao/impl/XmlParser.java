package by.tc.task02.dao.impl;

import by.tc.task02.entity.Essence;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlParser {


    public static List<String> parseXml(BufferedReader buffer, Pattern pattern){
        String string;
        List<String> parsedXml = new ArrayList<String>();
        Matcher match;
        try {
            while((string = buffer.readLine()) != null){
                match = pattern.matcher(string);

                while(match.find()){
                    parsedXml.add(match.group());
                    if(match.group(6) != null && match.group(6).contains("?xml") ) {
                        parsedXml.remove(match.group());
                    }
                }
            }
        } catch (IOException e) {
            return null;
        }

        return parsedXml;
    }
}
