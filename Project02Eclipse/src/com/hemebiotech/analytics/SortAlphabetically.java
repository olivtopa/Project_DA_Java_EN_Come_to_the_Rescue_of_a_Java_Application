package com.hemebiotech.analytics;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortAlphabetically  implements ISymptomHandler 
{
	private ArrayList<String> inputList;
	private Map<String, Long> inputMap;
	private TreeMap<String, Long> classerEnAlplha = new TreeMap<>();
	
	public SortAlphabetically (ArrayList<String>inputList) /* si le fichier d'entree est une List*/
	{
		this.inputList = inputList;
	}
	
	@SuppressWarnings("unchecked")
	public SortAlphabetically (Map<String, Long>inputMap) /* si le fichier d'entree est une Map*/
	{
		this.inputList = (ArrayList<String>) inputMap;
	}

	@Override
	public Map<String, Long> Handler() 
	{
		classerEnAlplha.putAll(inputMap);
		return classerEnAlplha;
	}
}
