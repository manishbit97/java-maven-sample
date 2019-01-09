package Task;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		/*Thread thread1 = new Thread(new task1(0,4,arr));
		Thread thread2 = new Thread(new task1(5,9,arr));
		Thread thread3 = new Thread(new task1(9,14,arr));*/
		//new Thread(new task1(9,14,arr)).start();
		
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Future<Integer> f1 = executor.submit(new task2(0,4,arr));
		Future<Integer> f2 = executor.submit(new task2(5,9,arr));
		Future<Integer> f3 = executor.submit(new task2(10,14,arr));
		
		try {
			Integer res1 = f1.get();
			Integer res2 = f2.get();
			Integer res3 = f3.get();
			
			
			System.out.println("Sum of all is = "+(res1+res2+res3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main exited!");
		
	}

}
