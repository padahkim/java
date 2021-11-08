package selfstudy1108;

import java.io.*;

public class ch8_15_exception {

	public static void main(String[] args) {
		//command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	}//main 메서드의끝
		static File createFile(String fileName) {
			try {
				if (fileName==null || fileName.contentEquals(""))
					throw new Exception("file name is weird");
			} catch (Exception e) {
				// fileName이 부적절한 경우, 파일이름은 notitle로 한다.
				fileName = "제목없음. txt";
			} finally {
				File f = new File(fileName);
				createNewFile(f);
				return f;
			}
		}
		static void createNewFile(File f) {
			try {
				f.createNewFile();//파일을 생성한다
			} catch(Exception e) {}
		}
}
