package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalyticsCounter {

	public AnalyticsCounter(String inputFile) {
		this.inputFile = inputFile;
	}

	String inputFile;

	ReadSymptomDataFromFile fileReader = new ReadSymptomDataFromFile(inputFile);

	List<String> inList = ReadSymptomDataFromFile.readFile();

	public Map<String, Long> analyticsCounter() {
		TreeMap<String, Long> countInAlphaOrder = new TreeMap<>();
		countInAlphaOrder
				.putAll(inList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		return countInAlphaOrder;

	}

}
