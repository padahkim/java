package java1119_thread;

import javax.swing.JOptionPane;

public class Java193_thread {

	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		System.out.println("isInterrupted():"+th1.isInterrupted());//false
		String input = JOptionPane.showInputDialog("아무값이나입력");
		System.out.println("입력하신 값은"+input+"입니다");
		th1.interrupt(); //interrupt()를 호출하면, interrupted상태가 ture가 된다.
		System.out.println("isInterrupted():"+th1.isInterrupted());
		System.out.println("isInterrupted():"+th1.isInterrupted());
		System.out.println("interrupted():"+th1.isInterrupted());
	}

}
	class ThreadEx9_1 extends Thread {
		public void run() {
			int i = 10;
			
			while(i!=0 && !isInterrupted()) {
				System.out.println(i--);
				for(long x=0;x<25000000L;x++);//시간지연
			}
			System.out.println("카운트가 종료");
		}
	}