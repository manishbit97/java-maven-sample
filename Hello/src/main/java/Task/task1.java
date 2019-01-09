package Task;

public class task1 implements Runnable {

	int sin,ein;
	int[] arr;
	
	public task1(int sin, int ein, int[] arr) {
		
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
