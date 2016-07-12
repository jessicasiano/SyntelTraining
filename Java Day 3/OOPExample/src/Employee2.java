
public class Employee2 {
	
	String name = null;
	String address = null;
	long phone1 = 0;
	long phone2 = 0;
	String email = null;
	
	public Employee2(String n, String a, long l1, long l2, String e){
		name = n;
		address = a;
		phone1 = l1;
		phone2 = l2;
		email = e;
	}
	
	public Employee2(String n, String a, long l1, String e){
		name = n;
		address = a;
		phone1 = l1;
		email = e;
	}
	
	public Employee2(String n, String a, long l1){
		name = n;
		address = a;
		phone1 = l1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
