
public class MainClass {

	public static void main(String[] args) {
		UseProperty UP = new UseProperty();
		UP.displayProperty();
	}

}

class Property{
	static int i = 10;
	static String n = "ABC";
}

class UseProperty{
	void displayProperty(){
		System.out.println(Property.i + " " + Property.n);
	}
	
}