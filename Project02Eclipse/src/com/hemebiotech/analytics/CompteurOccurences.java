package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompteurOccurences implements ISymptomHandler
{

	public CompteurOccurences (List<String>inputList)
	{
		this.inputList = inputList;
	}
	
	private List<String> inputList;
	private Map<String, Long> motComptes = new HashMap<>();
	
	
	@Override
	public Map<String, Long> Handler() 
	{
		motComptes = inputList.stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return motComptes;
	}

}
