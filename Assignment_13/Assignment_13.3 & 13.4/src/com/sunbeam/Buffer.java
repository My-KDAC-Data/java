/*
 Write a program that inputs 4 lines and stored them in a text ﬁle. Use BuﬀeredWriter class.
 
 Read a text ﬁle line by line and display on terminal. Hint: ﬁle --> FileReader --> BuﬀeredReader --> ...
 */




package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Buffer {
	
	
	public static void BufferWrite(){
		
		try(FileWriter fw=new FileWriter("File.txt") ) {
			
			try(BufferedWriter bw=new BufferedWriter(fw)) {
				
				for(int i=1; i<=4; i++)
				{
					System.out.println("Enter a Line:");
					Scanner sc=new Scanner(System.in);
					String line=sc.nextLine();
					bw.write(line);
					bw.newLine();
					
					
				}
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Line Saved.....");
	}
	
	public static void BufferRead()
	{
		try(FileReader fr=new FileReader("File.txt")) {
			
			try(BufferedReader br=new BufferedReader(fr)) {
				
				String line;
				
				while((line=br.readLine()) != null) {
					System.out.println(line);
				}
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		BufferWrite();
		BufferRead();
		

	}

}
