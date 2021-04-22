package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Class that counts and sorts the elements of a list (Symptoms file) in
 * alphabetical order
 *
 */

public class AnalyticsCounter {

	public AnalyticsCounter(String inputFile) {
		this.inputFile = inputFile;
	}

	String inputFile;

	public Map<String, Long> analyticsCounter() {

		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(inputFile);
		List<String> inList = readSymptomDataFromFile.getSymptoms();

		TreeMap<String, Long> countInAlphaOrder = new TreeMap<>();

		/**
		 * @return the counted and sorted elements of a inList a Map
		 */
		countInAlphaOrder
				.putAll(inList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		return countInAlphaOrder;

	}
}