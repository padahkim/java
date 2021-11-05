package java1104_collection;

import java.util.*;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("google");
		goURL("daum");
		goURL("yahoo");
		goURL("naver");//00
		
		printStatus();//2
		
		goBack();
		System.out.println("= 'previous' 버튼 누른 후 =");
		printStatus();//3
		
		goBack();
		System.out.println("= 'previous' 버튼 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= 'forward' 버튼 누른 후 =");
		printStatus();
		
		goURL("chodchobo.com");
		System.out.println("= 'after move to new address' =");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("current display'"+ back.peek()+"' 입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}//1
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}
}
