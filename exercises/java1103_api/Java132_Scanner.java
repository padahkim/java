package java1103_api;

import java.util.Scanner;

public class Java132_Scanner {

	public static void main(String[] args) {
		//콘솔창에서 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);//실행 후 콘솔창에서 데이터를 읽어옴
		System.out.print("이름:");
		
		//nextLine() 메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고 Enter를 하면 
		//nextLine()메소드에서 읽는다.(한 라인을 통째로 읽음 홍강 옹롱 미나)
		String name = sc.nextLine();
		System.out.println(name);
	}

}
