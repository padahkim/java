package java1111_jdbc;

import java.util.List;

public class Java203_jdbc {

	public static void main(String[] args) {
		CustomerDAO dao = CustomerDAO.getInstance();
		//List<CustomerDTO> aList = dao.searchMethod();
		
		List<CustomerDTO> aList = dao.searchMethod("동");
		for(CustomerDTO dto : aList)
			System.out.print(dto.toString());
	}//end main()
	
}//end class
