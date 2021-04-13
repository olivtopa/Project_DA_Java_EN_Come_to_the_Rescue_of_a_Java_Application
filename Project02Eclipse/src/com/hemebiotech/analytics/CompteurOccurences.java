package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		for(String mot : inputList) 
		{
			if ( motComptes.containsKey(mot) ) 
			{ 
				// si la ligne contient déjà un mot, on incrémente le compteur qui est associé
				motComptes.put(mot, motComptes.get(mot)+1);
		    }
		        else {
			       // sinon on ajoute l'association en initialisant le compteur à 1
		        	motComptes.put(mot, 1L);
		        }
		 }
		return motComptes;
	}

}
