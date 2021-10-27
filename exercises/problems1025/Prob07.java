package java1025.prob;

/*
1.score변수에 저장된 값에 따라 상, 중, 하를 출력하는 프로그램을 작성하시오.
 score 변수의 값이 80이상이면 "상",  80미만 65이상이면 "중", 65미만이면 "하" 로 출력하시오.
 
2. [출력결과]
   상
   
   식1 ? 참1 : 거짓1
   식1 ? (식2 ? 참2 : 거짓2) : 거짓1 
   식1 ? 참1 : (식2 ? 참2: 거짓2)
   식1 ? (식2 ? 참2: 거짓2) : (식3 ? 참3 : 거짓3)
  */

public class Prob07 {

	public static void main(String[] args) {
		int score = 85;
		String result = score >= 80? "상": score>=65? "중": "하";
		// 여기에 작성하시오.
		System.out.println(result);

	}// end main( )

}// end class
