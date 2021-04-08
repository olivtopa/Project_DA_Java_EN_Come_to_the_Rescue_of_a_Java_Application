package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader 
{

	private String filepath;
	
	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	
	public ReadSymptomDataFromFile (String filepath) 
	{
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() 
		{
			Map<String, Long> compteurs = new HashMap<>();
		
			List<String> linesToMap = compteurs.entrySet().stream()
														  .map(entry-> entry.getKey()+": "+entry.getValue())
														  .collect(Collectors.toList());
		
					
		if (filepath != null) 
		{
			try 
			{
		List<String> lines = Files.readAllLines(Paths.get(filepath));
			
			
			for(String line : lines) 
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
} catch (IOException e) 
			
			{
				e.printStackTrace();
			}
		
		}
		return linesToMap;
	
	}

}
