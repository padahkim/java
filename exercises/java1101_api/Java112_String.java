package Java1101_api;
/*
 * [출력결과]
 * 홍길동님은 남성입니다
 * 이영희님은 여성입니다
 * 잘못입력하셨습니다
 */
public class Java112_String {

	public static void main(String[] args) {
		String p1 = "홍길동,561203-1597650";
		String p2 = "이영희,031203-4097650";
		String p3 = "갑동이,901203-8897650";
		display(p1);
		display(p2);
		display(p3);
	}

	public static void display(String str) {
		String[] data = str.split(",");
		if(data[1].charAt(7)=='1'||data[1].charAt(7)=='3')
			System.out.printf("%s님은 %c입니다.\n", data[0], '남');
		else if(data[1].charAt(7)=='2'||data[1].charAt(7)=='4')
			System.out.printf("%s님은 %c입니다.\n", data[0], '여');
		else
			System.out.println("잘못입력하셨소");
		
		
	}
}
