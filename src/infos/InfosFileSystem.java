package infos;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class InfosFileSystem {

	private String absolutePath;
	private String fileName;
	boolean fileExists;
	boolean fileIsDirectory;
	boolean fileIsFile;
	private HashMap<String,ArrayList<String>> rootLectorsArbo;

    @Override
    public String toString(){
    	
    	return "*********[File Path Infos]*********\n" +
    			"Chemin absolu du fichier : " + this.absolutePath +"\n" +
    			"Nom du fichier : " + this.fileName +"\n" +
    			"Est-ce qu'il existe ? " + String.valueOf(this.fileExists) +"\n" +
    			"Est-ce un répertoire ? " + String.valueOf(this.fileIsDirectory) +"\n" +
    			"Est-ce un fichier ? " + String.valueOf(this.fileIsFile) +"\n" +
//    			printHashMap(this.rootLectorsArbo);
				this.rootLectorsArbo.toString()+"\n";
    	
    }

    public String printHashMap(HashMap<String,ArrayList<String>> hashMap){
   
    	return "0";
    }
    
	public InfosFileSystem(File f){
		
		this.absolutePath = f.getAbsolutePath();
		this.fileName = f.getName();
		this.fileExists = f.exists();
		this.fileIsDirectory = f.isDirectory();
		this.fileIsFile = f.isFile();
		
		this.rootLectorsArbo = setRootLectorsArbo(f);
	}
	    
	private HashMap<String,ArrayList<String>> setRootLectorsArbo(File f){
		
		HashMap<String,ArrayList<String>> hM = new HashMap<String,ArrayList<String>>();
		
	    for(File file : File.listRoots())
	    {
	    	ArrayList<String> tempList = new ArrayList<String>();
	    	//Affichage des lecteurs à la racine du PC : 
	    
	      try {
	        int i = 1;  
	        //On parcourt la liste des fichiers et répertoires
	        for(File nom : file.listFiles()){

	          //S'il s'agit d'un dossier, on ajoute un "/"
	          tempList.add((nom.isDirectory()) ? nom.getName()+"/" : nom.getName());

//	          if((i%4) == 0){
//	            System.out.print("\n");
//	          }
	          i++;
	        }
	        hM.put(file.getAbsolutePath(), tempList);
	        
	      } catch (NullPointerException e) {

	        //L'instruction peut générer une NullPointerException
	        //s'il n'y a pas de sous-fichier !

	      }
	    }   
  	  return hM;
	}
}


