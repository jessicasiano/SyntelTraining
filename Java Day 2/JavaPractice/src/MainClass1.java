
public class MainClass1 {
		static int i = 20;
	
	public static void main(String[] args) {
		MainClass1 obj1 = new MainClass1();
		MainClass1 obj2 = new MainClass1();
		obj1.i=25;
		obj2.i=100;
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		
		System.out.println("----------------------------");
		
		System.out.println(Calculator2.getInstance().add(3,10));
	}

}

class Calculator2{
	
	public static Calculator2 getInstance(){
		return new Calculator2();
	}
	
	int add(int a, int b){
		return a + b;
	}
}