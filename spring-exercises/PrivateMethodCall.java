package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception{
		//Hello hello = new Hello();
		//hello.main();//private�̶� �ܺ� ȣ���� �Ұ���
		
		//private�ε� �ܺ� url�� ��� ���ٰ���?Reflection API�� ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ��� ����
		//java.lang.reflect ��Ű���� ����
		//HelloŬ������ Class��ü(Ŭ������ ������ ��� �ִ� ��ü�� ���´�)�̰� �̿��ؼ� ��ü ���� �� ���θ޼��� ȣ���� �غ�����
		//private�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.//Ŭ�������ϸ��� Class��ü�� �ϳ��� �����ȴ�. �ڹ���������Ʃ�� java.lnag��Ű�� 16:41//
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");//forName�� ��Ű���̸� �������//Ŭ���������� �޸𸮿� �ö󰥶�,
		Hello hello = (Hello)helloClass.newInstance();//Class��ü�� ���� ������ ��ü ����
		//helloŬ������ ������ �ִ� main�޼��带 �ۿ��� ȣ�Ⱑ���ϰ� �ٲٱ� 
		Method main = helloClass.getDeclaredMethod("main");//1.main�̶�� �޼����� ������ �������
		main.setAccessible(true);//private�� main�޼��带 ȣ�Ⱑ���ϰ���
		main.invoke(hello);// hello.main()
		
	}

}
