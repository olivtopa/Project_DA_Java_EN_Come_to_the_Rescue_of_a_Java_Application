package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class which writes a Map to an output file 
 *
 */

public class WriteInFile implements Writer {
	private Map<String, Long> inputMap;
	private static final String OUTPUT_FILE = "results.out";

	public WriteInFile(Map<String, Long> inputMap) {
		this.inputMap = inputMap;
	}

	@Override
	public Map<String, Long> writer() {

		List<String> listForFile = inputMap.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
				.collect(Collectors.toList());
		try {
			Files.write(Paths.get(OUTPUT_FILE),listForFile); /* Writing the generated List in the output file*/
		} catch (IOException e) {

			e.printStackTrace();
		}

		return null;
	}

}
