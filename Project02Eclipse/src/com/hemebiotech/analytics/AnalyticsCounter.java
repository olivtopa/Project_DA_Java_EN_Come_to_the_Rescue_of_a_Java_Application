package com.hemebiotech.analytics;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AnalyticsCounter 
{

	private static String fichierEntree = "symptoms.txt";
	private static String fichierSortie = "results.out";
	
	public static void main(String args[]) throws Exception 
	{
		try
		{
		/* lecture du fichier en entrée*/
			
	ReadSymptomDataFromFile LectureFichierEntree = new ReadSymptomDataFromFile(fichierEntree);
	
	
		/* Creation du fichier de sortie*/
	Files.write(Paths.get(fichierSortie), LectureFichierEntree.GetSymptoms());	
		
		}
		
	catch (IOException e) 
		{
		e.printStackTrace();
		}
	}
}
		