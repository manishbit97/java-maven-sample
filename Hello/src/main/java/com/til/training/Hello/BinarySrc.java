package com.til.training.Hello;

public class BinarySrc {

	public static void main(String args[])
	{
	int n = Integer.parseInt(args[0]);
	int src= Integer.parseInt(args[1]);
	int[] inp = new int[n];
	
	for(int i=0;i<n;i++)
	{
		inp[i]= Integer.parseInt(args[i+2]);
		
	}
	System.out.println("Number found = "+binarysearch(inp,n,src));


}
	
	public static boolean binarysearch(int arr[], int n, int src)
	{
		int low = 0;
		int high = n-1;
		
			while(low<high)
	{
		int mid = (low+high)/2;
		
		if(arr[mid]==src)
			return true;
		
		else if(src<arr[mid])
			high = mid-1;
		else 
			low=mid+1;
	}
		
			return false;
	}
	
}
