package com.til.training.Hello.Stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import model.Song;

public class playlist {

	private static final String LOCATION = "C:\\Users\\c-manish.kumar\\Desktop\\song.txt";
	
	void readFromFile()
	{
		File file = new File(LOCATION);
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<Song> ar= new ArrayList<Song>();
		String line;
		try {
			while((line=reader.readLine())!=null)
			{
				String tokens[] = line.trim().split("#");
				Song s = new Song();
				s.setTitle(tokens[0]);
				s.setSinger(tokens[1]);
				s.setMovie(tokens[2]);
				s.setBps(Integer.parseInt(tokens[3].trim()));
				ar.add(s);
				
			}
			System.out.println(ar);
			
			
			//Sorting
			Collections.sort(ar);
			System.out.println(ar);
		
			//System.out.print("Title ->"+ar.title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
		
}
