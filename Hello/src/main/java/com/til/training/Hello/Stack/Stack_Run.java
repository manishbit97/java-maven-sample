package com.til.training.Hello.Stack;

import java.util.Scanner;

import model.Song;

public class Stack_Run {

	
	public static void main(String args[])
	{
		
//		Resizable_stack ob = new Resizable_stack();
//		
//		
//		Scanner in = new Scanner(System.in);
//		
//		ob.push("manish");
//		ob.push("qwer");
//		ob.push("qazx");
//
//		System.out.println(ob.pop());
//		System.out.println(ob.pop());
//		System.out.println(ob.pop());
//		System.out.println(ob.pop());
		
		
	/*	GenericStackOfObjects<Song> ob = new GenericStackOfObjects<Song>();
		
		
		Song song = new Song();
				
		song.setBps(90);
		song.setMovie("genius");
		song.setSinger("Arijit");
		song.setTitle("Tera fitoor");
		ob.push(song);
		
		ob.pop();
		System.out.println(song);*/
		
		
		playlist ob = new playlist();
		
		ob.readFromFile();
	}
}
