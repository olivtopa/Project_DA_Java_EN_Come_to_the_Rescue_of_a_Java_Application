package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter 
{
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;
	private static ReadSymptomDataFromFile LectureFichierEntree;
	
	
	public static void main(String args[]) {
		/** lecture du fichier en entrée*/
		
		LectureFichierEntree = new ReadSymptomDataFromFile("symptoms.txt");
		
		ReadSymptomDataFromFile lignes = LectureFichierEntree;
		/*Map<String, Long> compteurs = new HashMap<>();*/
		for(String line : ReadSymptomDataFromFile.GetSymptoms()) 
		{
		 
			if ( compteurs.containsKey(line) ) 
			{ 
				// si la ligne contient déjà la ligne, on incrémente le compteur qui est associé
		                compteurs.put(line, compteurs.get(line)+1);
		    }
		        else 
		        {
			       // sinon on ajoute l'association en initialisant le compteur à 1
			       compteurs.put(line, 1L);
		        }
		 
		}
		
	}
	
	
		/* ---------------------------------------------------
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		--------------------------------*/
}