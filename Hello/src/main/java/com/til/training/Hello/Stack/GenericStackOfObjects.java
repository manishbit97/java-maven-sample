package com.til.training.Hello.Stack;

public class GenericStackOfObjects<T> {

	T[] s ; 
	int i;
	public GenericStackOfObjects()
	{
		i=0;
		s = (T[])new Object[1];
	}
	 
	private void resize(int si)
	 {
		 
		 T[] s2 =(T[])new Object[2*si];
		 
		 for(int j=0;j<i;j++)
			 s2[j]=s[j];
		 
		 s = s2;
	 }
	 
	 void push(T str)
	{
		 if(i==s.length-1)
		 {
			 resize(2*s.length);

		 } 
		s[i++]=str;
	}
	
	 T pop()
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
