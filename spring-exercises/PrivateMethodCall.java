package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception{
		//Hello hello = new Hello();
		//hello.main();//private이라서 외부 호출이 불가능
		
		//private인데 외부 url로 어떻게 접근가능?Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 기능 제공
		//java.lang.reflect 패키지를 제공
		//Hello클래스의 Class객체(클래스의 정보를 담고 있는 객체를 얻어온다)이걸 이용해서 객체 생성 및 메인메서드 호출을 해보겠음
		//private인 main()을 호출가능하게 한다.//클래스파일마다 Class객체가 하나씩 생성된다. 자바의정석유튜브 java.lnag패키지 16:41//
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");//forName에 패키지이름 써줘야함//클래스파일이 메모리에 올라갈때,
		Hello hello = (Hello)helloClass.newInstance();//Class객체가 가진 정보로 객체 생성
		//hello클래스가 가지고 있는 main메서드를 밖에서 호출가능하게 바꾸기 
		Method main = helloClass.getDeclaredMethod("main");//1.main이라는 메서드의 정보를 가지고옴
		main.setAccessible(true);//private인 main메서드를 호출가능하게함
		main.invoke(hello);// hello.main()
		
	}

}
