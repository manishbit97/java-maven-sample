package Task;

import java.util.concurrent.Callable;

public class task2 implements Callable<Integer> {

	int sin,ein;
	int[] arr;
	
	public task2(int sin, int ein, int[] arr) {
		
		this.sin = sin;
		this.ein = ein;
		this.arr = arr;
	}

	public void run() {
		int sum=0;
		for(int i=sin;i<=ein;i++)
			sum+=arr[i];
		System.out.println("Thread name= "+Thread.currentThread().getName()+"Sum of THread is = "+sum);		
	}
	
	

}
