package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;


public class AnalyticsCounter 
{

	private static String fichierEntree = "symptoms.txt";
		
	
	public static void main(String args[]) 
	{
		/* lecture du fichier en entrée*/
	ReadSymptomDataFromFile LectureFichierEntree = new ReadSymptomDataFromFile(fichierEntree);
	List<String> copie = LectureFichierEntree.GetSymptoms();
	
		/* compteur occurences des symptomes */
	CompteurOccurences Comptage = new CompteurOccurences(copie);
	Map<String, Long> motsComptes = Comptage.Handler();
	
	/* classement par ordre alphabétique */
	SortAlphabetically OdreAlphabetique = new SortAlphabetically(motsComptes);
	Map<String, Long> fichierFini = OdreAlphabetique.Handler();
	
	WriteInFile FichierFinal = new WriteInFile(fichierFini);
	FichierFinal.Handler();
	
		
		/* Creation du fichier de sortie*/
	
	}
	
}
		