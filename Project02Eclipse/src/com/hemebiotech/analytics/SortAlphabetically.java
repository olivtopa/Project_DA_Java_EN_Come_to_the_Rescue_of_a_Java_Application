package com.hemebiotech.analytics;


import java.util.Map;
import java.util.TreeMap;

public class SortAlphabetically  implements ISymptomHandler 
{
	
	public SortAlphabetically (Map<String, Long>inputMap) /* si la donnée en entree est une Map*/
	{
		this.inputMap = (Map<String, Long>) inputMap;
	}

	/*private ArrayList<String> inputList;*/
	private Map<String, Long> inputMap;
	private TreeMap<String, Long> classerEnAlplha = new TreeMap<>();
	
	@Override
	public Map<String, Long> Handler() 
	{
		classerEnAlplha.putAll(inputMap);
		return classerEnAlplha;
	}
}
