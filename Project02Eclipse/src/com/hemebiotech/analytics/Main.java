package com.hemebiotech.analytics;

public class Main {

	private static final String INPUTFILE = "symptoms.txt";

	public static void main(String[] args) {

		AnalyticsCounter anlyticsCounter = new AnalyticsCounter(INPUTFILE);

		anlyticsCounter.trendCounting();

	}

}
