package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WriteInFile implements ISymptomHandler
{
	Map<String, Long> mapEntree;
	private static String fichierSortie = "results.out";
	
	
	public WriteInFile (Map<String, Long> mapEntree)
	{
		this.mapEntree = mapEntree;
	}
	
	@Override
	public Map<String, Long> Handler(){
		
		List<String> ListForFile = mapEntree.entrySet()	/* Création format mot : nbreOcurrence et conversion Map en List*/
				.stream()
				.map(entry-> entry.getKey()+": "+entry.getValue())
				.collect(Collectors.toList());
		try {
			Files.write(Paths.get(fichierSortie), ListForFile);	/* Ecriture de la List générée dans le fichier de sortie */
			} catch (IOException e) {
			
			e.printStackTrace();
		}

		return null;
	}
	

}
