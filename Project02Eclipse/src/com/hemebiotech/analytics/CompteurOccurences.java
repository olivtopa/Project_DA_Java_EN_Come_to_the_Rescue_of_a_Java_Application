package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompteurOccurences implements ISymptomReader
{

	private ArrayList<String> inputList;
	private Map<String, Long> compteurs = new HashMap<>();
	
	public CompteurOccurences (ArrayList<String>inputList)
	{
		this.inputList = inputList;
	}
	
	@Override
	public List<String> GetSymptoms() 
	{
		for(String line : inputList) 
		{
			if ( compteurs.containsKey(line) ) { 
				// si la ligne contient déjà la ligne, on incrémente le compteur qui est associé
		                compteurs.put(line, compteurs.get(line)+1);
		        }
		        else {
			       // sinon on ajoute l'association en initialisant le compteur à 1
			       compteurs.put(line, 1L);
		        }
		 }
		return compteurs;
	}

}
