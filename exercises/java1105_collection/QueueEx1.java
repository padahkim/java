package java1104_collection;

import java.util.*;

public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개 까지만 저장 되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
		
		while(true) {
			System.out.print(">>");
			try {
				//화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;//아래를 건너뛰로 while의 트루로 감
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - showing help");
					System.out.println(" q or Q - exit program");
					System.out.println(" history - showing the newist input of"+MAX_SIZE);
				} else if (input.equalsIgnoreCase("history")) {
					save(input); //입력 받은 명령어를 저장하고,
					
					//LinkedList의 내용을 보여준다.
					LinkedList list = (LinkedList)q;
					final int SIZE = list.size();//반복문 돌때 마다 list.size()를 호출하므로 그리 안좋음.... 반복문 돌동안 안변하므로 상수로 주는게 좋음
					for(int i=0 ; i<SIZE ; i++)
						System.out.println((i+1)+"."+list.get(i));
				} else {
					save(input);
					System.out.println(input);
				} //if(input.equalsIgnoreCase("q"){
			}	catch(Exception e) {
				System.out.println("입력오류입니다");
			}//catch
		}//while
	}//main

	public static void save(String input) {
		//save to queue 빈문자열이 아닐때
		if(!"".equals(input))//if(input!=null && !input.equals(""))
			q.offer(input);
		//queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다
		if(q.size() > MAX_SIZE) 
			q.remove();
	}
	
}
