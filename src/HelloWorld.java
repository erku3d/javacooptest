
public class HelloWorld {

	private static void println(String s){
		
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		println("Hello World");
		
		
		MyMath m = new MyMath();
		
		m.setVal1(1);
		m.setVal2(2);
		
		println(String.valueOf(m.getVal1()));
		
		DummieClass d = new DummieClass();
		d.print("geht");

	}

}
