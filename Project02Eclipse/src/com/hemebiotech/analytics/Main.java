package com.hemebiotech.analytics;

import java.util.Map;

public class Main {

	private static final String INPUTFILE = "symptoms.txt";
	
	

	public static String getInputFile() {
		return INPUTFILE;
	}

	public static void main(String[] args) {

		Map<String, Long> finalvariable = new AnalyticsCounter(INPUTFILE)
				.analyticsCounter(); /** counts and sorts the words in alphabetical order andreturns a map */

		new WriteInFile(finalvariable).writer();

	}

}
