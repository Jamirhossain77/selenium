package com.fileString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAddress {
	public static void main(String[] args) throws IOException {
		
		
FileReader fr =new FileReader("C:\\Users\\jamir\\Documents\\Address.text");	
BufferedReader br = new BufferedReader(fr);
	String st;
	while((st=br.readLine())!=null) { 
		
		//System.out.println(st);
		
		String[]s=st.split(",");
		System.out.println("\n");
		System.out.println("First_Name :"+s[0]);
		System.out.println("Maddle_Name:"+s[1]);
		System.out.println("Last_Name  :"+s[2]);
		System.out.println("Address    :"+s[3]);
		System.out.println("Apt#       :"+s[4]);
		System.out.println("City       :"+s[5]);
		System.out.println("Zip_Code   :"+s[6]);
		System.out.println("Phone_No   :"+s[7]);
	}
  }
}
