package java1111_jdbc;

import java.util.HashMap;
import java.util.Scanner;


/*
 * 아래를 참조 main() method를 추가하는 로직 구현
 * 
 * [customertbl 테이블]
 * 필드명			데이터타입 및 크기			제약조건				설명
 * code			char(4)					기본키, not null		상품코드
 * name			varchar(10)
 * price		int
 * product		char(10)
 * 
 * [실행 결과]
 * 고객코드	고객이름	상품가격		상품명
 * 	A001       홍길동      	15000      	Nikon
    A002       이영희      	25000       Sony
    A003       박달재       18000   	FujiFilm
    
    String code; //고객코드
	String name; //고객이름
	int price; //가격
	String product; //상품명
 */

public class Java202_jdbc {

	public static void main(String[] args) {
		
		CustomerDAO dao = CustomerDAO.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDTO dto = new CustomerDTO();
		/*
		System.out.print("고객코드: ");
		dto.setCode(sc.nextLine());
		
		System.out.print("고객이름: ");
		dto.setName(sc.nextLine());
		
		System.out.println("상품가격: ");
		dto.setPrice(Integer.parseInt(sc.nextLine()));
		
		System.out.print("상품명: ");
		dto.setProduct(sc.nextLine());
		
		dao.insertMethod(dto);
		*/
		
		/*System.out.print("입력 데이터: ");
		String code = sc.next();
		String name = sc.next();
		int price = sc.nextInt();
		String product = sc.next();
		
		dto.setCode(code);
		dto.setName(name);
		dto.setPrice(price);
		dto.setProduct(product);*/
		
		/*System.out.print("입력 데이터 : ");
		String[] data = sc.nextLine().split("[\\s]+");
		dto.setCode(data[0]);
		dto.setName(data[1]);
		dto.setPrice(Integer.parseInt(data[2]));
		dto.setProduct(data[3]);*/
		
		//dao.insertMethod(dto);
		//dao.appendMethod(dto);

///////////////////////////////////////////////////////////////////////////
//		dao.selectMethod();
//		
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("price",  new Integer(50000));
//		map.put("product", new String("samsung"));
//		map.put("code", new String("A001"));
//		
//		dao.updateMethod(map);
//		dao.selectMethod();
///////////////////////////////////////////////////////////////////////////
		dao.selectMethod();
		dao.deleteMethod("A003");
		dao.selectMethod();
		
		sc.close();
	}//end main

}//end class
