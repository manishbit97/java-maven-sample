package com.til.training.Hello.Stack;

public class StackImp {

	String[] s ;
	StackImp(int size)
	{
		i=0;
		s = new String[size];
	}
	
	 
	 int i;
	
	 void push(String str)
	{
		s[i++]=str;
	}
	
	 String pop()
	{
		 if(!isEmpty())
			 return s[--i];
		 
		 return null;
	}
	
	boolean isEmpty()
	{
		if(i==0)
			return true;
		else 
			return false;
	}
	
}
