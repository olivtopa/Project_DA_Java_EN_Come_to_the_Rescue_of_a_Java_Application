package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader{

	/**
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */

	/*
	 * public ReadSymptomDataFromFile(String filePath) {
	 * ReadSymptomDataFromFile.filePath = filePath; }
	 */

	String inputFile;
	
	public ReadSymptomDataFromFile(String inputFile) {
		this.inputFile = inputFile;
		
	}

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		if (inputFile != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(inputFile);
		return result;
	}
}