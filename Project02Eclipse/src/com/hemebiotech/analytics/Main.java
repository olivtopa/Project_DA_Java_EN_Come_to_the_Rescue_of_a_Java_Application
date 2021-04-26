package com.hemebiotech.analytics;

import java.util.Map;

public class Main {

	private static final String INPUTFILE = "symptoms.txt";

	public static void main(String[] args) {

		Map<String, Long> finalvariable = new AnalyticsCounter(INPUTFILE).analyticsCounter();

		new WriteInFile(finalvariable).writer();

	}

}
