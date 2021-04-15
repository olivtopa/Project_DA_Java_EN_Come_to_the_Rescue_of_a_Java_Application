package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile {

	/**
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	/*private*/ static String inputFile;

	ReadSymptomDataFromFile(String inputFile) {
	}

	static List<String> readFile() {

		List<String> result = new ArrayList<>();
		try {

			result = Files.readAllLines(Paths.get(inputFile));
		} catch (IOException e) {
			e.printStackTrace();
			
		}

		return result;
	}
}