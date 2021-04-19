package com.hemebiotech.analytics;

import java.util.Map;

public class Main {

	private static final String INPUTFILE = "symptoms.txt";

	public static void main(String[] args) {
		/** counts and sorts the words in alphabetical order andreturns a map */

		Map<String, Long> finalvariable = new AnalyticsCounter(INPUTFILE).analyticsCounter();

		new WriteInFile(finalvariable).writer();

	}

}
