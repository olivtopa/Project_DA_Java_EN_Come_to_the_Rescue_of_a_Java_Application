package com.hemebiotech.analytics;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * the exceptions on access to the file to read are managed by the class
 * dedicated to this function (ReadSymptomDataFromFile)
 *
 */

public class AnalyticsCounter {

	public AnalyticsCounter(String inputFile) {
		this.inputFile = inputFile;
	}

	String inputFile;

	void analyticsCounter() {

		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(inputFile);
		List<String> inList = readSymptomDataFromFile.getSymptoms();

		TreeMap<String, Long> countInAlphaOrder = new TreeMap<>();

		countInAlphaOrder
				.putAll(inList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		if (Files.exists(Paths.get(inputFile))) {
			WriteInFile writeInFile = new WriteInFile(countInAlphaOrder);
			writeInFile.writer();
		}

	}
}