package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader 
{

	String cheminFichier; /* attribut */
	
	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	
	public ReadSymptomDataFromFile (String fichier)  /* constructeur */
	{
		this.cheminFichier = fichier; /* initialisation des attributs avec la valeur passée au constructeur */
	}
	
	public List<String> GetSymptoms() 
		{
			Map<String, Long> mapOrdonnee = new LinkedHashMap<>(); /* Map qui va contenir ma liste en respecterant
																	 l'odre du fichier d'entrée */
			TreeMap<String, Long> mapEnAlphabetique = new TreeMap<>();
			mapEnAlphabetique.putAll(mapOrdonnee); /* nouvelle map avec classement des symptomes en ordre alphabetique */
			
			
			if (cheminFichier != null) 
			{
				try 
				{
			List<String> tousLesSymptomes = Files.readAllLines(Paths.get(cheminFichier));
					
				for(String symptome : tousLesSymptomes) 
				{
				 
					if ( mapOrdonnee.containsKey(symptome) ) { 
						
						mapOrdonnee.put(symptome, mapOrdonnee.get(symptome)+1); /* on associe à la présente key (symptome), la valeur incrémentée de 1*/
				        }
				        else {
					     
				        	mapOrdonnee.put(symptome, (long) 1); /* si symptome jamais rencontré, la valeur correspondante sera 1 (qui est un long) */
				        }
			
				}
	} catch (IOException e) 
				
				{
					e.printStackTrace();
				}
			
			}
			
			List<String> listFinale = mapEnAlphabetique.entrySet().stream()
									.map(entry-> entry.getKey()+": "+entry.getValue()) /* collecte des cles et des valeurs de la map*/
									.collect(Collectors.toList()); /* envoie, dans l'ordre collectés, ces elements vers une liste*/
			return listFinale;
		
		
	
	}

}
