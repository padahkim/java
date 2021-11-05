package java1104_collection;

import java.util.*;

public class ArrayListEx2 {
//source문자열을 10의 길이로 잘라서 반환
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
	
		List list = new ArrayList(length/LIMIT+10);
		
		for(int i=0; i< length; i=i+LIMIT)
			if(i+LIMIT < length)
				list.add(source.substring(i,i+LIMIT));
			else
				list.add(source.substring(i));
			
		for(int i=0; i< list.size(); i++)
			System.out.println(list.get(i));			
	}
}	
					
								//43 i=0일때 substring(0,10)첫번째바퀴 돌고 i=10이되고 
								 //i=0+10 substring(10,20)두번째 바퀴 돌고 i=20
								// i=0+10+10 substring(20,30)    i=30
								// i=30 substring(30,40)      i=40 40<43이므로 한바퀴 더돌아야 하는게 아닌가? 40->50 즉 i=50
								//i=40 substring(40,50)       
		
		///////////////////////---------------내가 착각한 것----------------
	                           //for 문의 {}끝까지 간 이후에 i값이 증가하는것 즉 i = 30이 되는 시점에 substring(30,40)이 되고 if문 끝가지 가고/i는 40이 됨.
									//43>40+10이 아니므로 엘스로 가고 i=40박음 나는 여기서 i+LIMIT여기 limit부분을 관가함		
	/*	
		for(int i=0; i<length; i+=LIMIT) {
			if(length>i+LIMIT)
				System.out.println(source.substring(i, i+LIMIT));
			else	
				System.out.println(source.substring(i));
		}
		
			//System.out.println(source.charAt(i));
	}

}
	*/