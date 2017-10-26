package by.tc.task02.dao.impl;

import by.tc.task02.dao.EssenceDAO;
import by.tc.task02.entity.Essence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.io.*;

public class EssenceDAOImpl implements EssenceDAO {

	private static String fileName = "task02.xml";
	private static Pattern pattern;
	private TreeMaker maker = new TreeMaker();
	static{
		pattern = Pattern.compile("(<[^?!]([^<>]+)/>)|(</([^<>]+)>)|(<[^?!]([^<>]+)>)|([^<>]+)",Pattern.CASE_INSENSITIVE);
	}

	@Override
	public Essence makeEssence() {

		List<String> parsedXml;
		FileInputStream fstream;
		Essence essence = new Essence();
		try {
			fstream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			return null;
		}
		BufferedReader buffer = new BufferedReader(new InputStreamReader(fstream));
		parsedXml = XmlParser.parseXml(buffer, pattern);
		if (parsedXml.isEmpty()) {
			return null;
		}
		for(String entry : parsedXml){
			switch(MeanOfEntry.getMeanOfEntry(entry, pattern)){
				case "openTag":{
					essence = maker.addEssense(essence, entry);
					break;
				}
				case "closeTag":{
					essence = maker.stepBack(essence);
					break;
				}
				case "singleTag": {
					essence = maker.addEssense(essence, entry);
					essence = maker.stepBack(essence);
					break;
				}
				case "data": {
					maker.addData(essence, entry);
					break;
				}
				default: break;
			}
		}
		return essence;
	}
}

