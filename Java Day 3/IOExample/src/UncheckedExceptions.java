class Arithmetic{
	public static int divide(int a, int b){
		int x = 0;
		try{
			x = a/b;
			return x;
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
			System.out.println("Will automatically return 0");
			return 0;
		}
		finally{
			System.out.println("Finally");
			//return -1;
		}
	}	
}

public class UncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arithmetic.divide(10, 0));

	}

}
