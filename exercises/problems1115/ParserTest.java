package java1115_api.prob;
//if return type is interface , 해당 메소드의 리턴 타입이 인터페이스를 구현한 클래스의 인스턴스임을 뜻한다.
interface Parseable {
	public abstract void parse(String fileName);
}

class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();//위나 아래가 같음. 표현방법만 살짝 다르게 한것.
			return p;
		}
	}
}




class XMLParser implements Parseable {
	public void parse (String fileName) {
		System.out.println(fileName+"XML parsing completed");
	}
}

class HTMLParser implements Parseable {
	public void parse (String fileName) {
		System.out.println(fileName+"HTML parsing completed");
	}
}




public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");

	}

}
