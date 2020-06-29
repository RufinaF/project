package com.app.sample;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class file {
	 static String directory="E:\\samp_dir";
	
	public static void main(String[] args) {
		
		String name;
	    String c;
	    
	    
	    File dir=new File(directory);
	    String fileContent=" ";
	    
	    if(!dir.exists()) {
	    dir.mkdir();
	    }
	    
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter file name");
	    name=s.nextLine();
	    String fname=directory+"\\"+name;
	     File f=new File(fname);
	     if(!f.exists()) {
	    	 try {
				f.createNewFile();
				System.out.println("Enter the contents in the file");
				FileWriter fw=new FileWriter(fname);
				fw.write(s.nextLine());
				fw.close();
				System.out.println("file created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }else {
	    	 System.out.println("file already exists");
	     }
	     
	 		
	 	}

		
	


}
