package java1119_thread;

public class Java192_thread implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Java192_thread());//Thread(Runnable r) 러너블 인퍼페이스를 구현한 클래스 객체를 넣어줘야함
		                                            //= 러너블인터페이스에 구현된 run메서드를 작성해서 스레드에 전달하란말
		t.setDaemon(true);//이 부분이 없으면 종료되지 않는다.
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true;
			}
		
			System.out.println("프로그램을 종료합니다.");//10초후메 메인쓰레드가 종료되니  밑의 런부터 있는 데몬쓰레드가 종료됨
		}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);//3초마다
			} catch(InterruptedException e) {}
			
			if(autoSave) autoSave();
			//autoSave의 값이 true이면 autoSave()를 호출한다 5초후부터 6초 9초 , 즉 3초간격으로 메인이 종료될때까지시행됨
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
