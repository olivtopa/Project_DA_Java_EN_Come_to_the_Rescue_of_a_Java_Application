package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class SortAlphabetically implements ISymptomHandler {

	public SortAlphabetically(Map<String, Long> inputMap) {
		this.inputMap = inputMap;
	}

	private Map<String, Long> inputMap;
	private TreeMap<String, Long> classerEnAlplha = new TreeMap<>();

	@Override
	public Map<String, Long> handler() {
		classerEnAlplha.putAll(inputMap);
		return classerEnAlplha;
	}
}
