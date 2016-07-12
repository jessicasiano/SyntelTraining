
class OOPExample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager a = new Manager(101, "James", "Phoenix");
		Developer b = new Developer(102, "Jerry", "Atlanta");
		Accountant c = new Accountant(103, "Thomas", "New York");

	}
}

class Employee {
	
	static final String companyName = "Syntel, Inc.";
	private int id;
	private String name;
	private String address;
	
	Employee(int i, String n, String a){
		this.id = i;
		this.name = n;
		this.address = a;
	}
	
	public int getid() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static String getCompanyname() {
		return companyName;
	}
}

class Manager extends Employee{

	Manager(int i, String n, String a) {
		super(i, n, a);
		// TODO Auto-generated constructor stub
	}
	
}
class Developer extends Employee{

	Developer(int i, String n, String a) {
		super(i, n, a);
		// TODO Auto-generated constructor stub
	}
	
}
class Accountant extends Employee{

	Accountant(int i, String n, String a) {
		super(i, n, a);
		// TODO Auto-generated constructor stub
	}
	
}
