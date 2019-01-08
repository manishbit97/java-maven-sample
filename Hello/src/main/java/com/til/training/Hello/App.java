package com.til.training.Hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int i = Integer.parseInt(args[0]);
        boolean res= false;
        if(i%4==0)
        	res = true;
        if(i%4==0 && i%100!=0)
        	res= true;
        if((i%4==0 && i%100!=0) || i%400!=0)
        	res = true;
        
        
        System.out.println("res="+res);
    }
}
