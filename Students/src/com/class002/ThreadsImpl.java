package com.class002;

public class ThreadsImpl {

	public static void main(String[] args) {

		for(int i =0; i<5; i++) {
			
			A obj = new A(i);
			Thread th = new Thread(obj);
			
			th.run();
			
		}

	}

}

class A implements Runnable {
	
	int n;
	
	public A(int n) {
		this.n=n;
	}
	
	
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			try {

				Thread.sleep(1000);

			} catch (Exception e) {

			}

			System.out.println(i + " is now n object " + n);

		}

	}

}
