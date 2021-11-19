package java1119_thread;

public class Java191_thread {
		static long startTime = 0;
	
	public static void main(String[] args) {
		
		
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		
		Thread t2 = new Thread(r); //생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
		try {
			t1.join(); //main쓰레드가 th1의 작업이 끝날 때 까지 기다린다
			t2.join(); //main쓰레드가 th1의 작업이 끝날 때 까지 기다린다
		} catch(InterruptedException e) {}
		
		
		System.out.println("소요시간"+(System.currentTimeMillis()-startTime));
	}
}
class ThreadEx1_1 extends Thread{//1.Thread클래스를 상속해서 쓰레드 구현
	public void run() {//쓰레드가 수행할 작업을 작성
		for(int i=0; i<500; i++) {
			System.out.print(this.getName());//조상인 thread로부터 상속 받은 메서드 getName
		}
	}
}

class ThreadEx1_2 implements Runnable {//2. Runnable 인터페이스를 구현
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print(Thread.currentThread().getName());
		}
	}
}


