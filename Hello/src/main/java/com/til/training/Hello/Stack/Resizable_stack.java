package com.til.training.Hello.Stack;

public class Resizable_stack {

	String[] s ;
	public Resizable_stack()
	{
		i=0;
		s = new String[1];
	}
	
	 
	 int i;
	
	 
	private void resize(int si)
	 {
		 
		 String[] s2 =new String[2*si];
		 
		 for(int j=0;j<i;j++)
			 s2[j]=s[j];
		 
		 s = s2;
	 }
	 
	 void push(String str)
	{
		 if(i==s.length-1)
		 {
			 resize(2*s.length);

		 }
		 
		 
		 
		 
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
