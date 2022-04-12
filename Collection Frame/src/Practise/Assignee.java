package Practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Assignee {

	public static void main(String[] args) throws Exception {

		/*
		 * File file= new File("C:\\Users\\USER\\Desktop\\Demo.txt"); FileReader fr =
		 * new FileReader(file);
		 * 
		 * BufferedReader br = new BufferedReader(fr);
		 * 
		 * //StringBuffer sb = new StringBuffer(); String line;
		 * 
		 * while((line=br.readLine())!=null) { System.out.println("Content of file::");
		 * //System.out.println(sb.toString); System.out.println(line);
		 * 
		 * 
		 * } fr.close();
		 */
		
		
		
		
		  String s1="abc;"; String s2=new String("abc");
		  
		  String s3=new String("abc");
		  
		  System.out.println(s1.equals(s2));
		  
		  System.out.println(s1==s2); System.out.println(s3.equals(s2));
		  
		  
		  
		  
		  String name="nageswar"; name.concat("rao"); System.out.println(name);
		 
		
		/*
		 * for(;true;) {System.out.println("Helloworld");
		 * 
		 * }
		 */
	  
	}
}

