package firstDayJava;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("This is the main class");
	
		MobilePhone mp=new MobilePhone();
		
		mp.makeCalls();
		
		String nameOfBrand= mp.brandName;
		
		System.out.println(nameOfBrand);
		
	}
}
