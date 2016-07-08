
public class Employee {
	private final String companyName = "Syntel";
	private String efirstName;
	private String elastName;
	private long contactNumber;
	private String emailAddr;
	
	//functions
	//default constructor
	Employee(){}
		
	//constructor with initializations
	Employee(String fn, String ln, long cn, String em){
		efirstName = fn;
		elastName = ln;
		contactNumber = cn;
		emailAddr = em;
	}
	
	//setters and getters
	public String getEfirstName() {
		return efirstName;
	}

	public void setEfirstName(String efirstName) {
		this.efirstName = efirstName;
	}

	public String getElastName() {
		return elastName;
	}

	public void setElastName(String elastName) {
		this.elastName = elastName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getCompanyName() {
		return companyName;
	}

		
}

class AddEmployee{
	public static void main(String[] ar){
		Employee Ankit = new Employee();
		Ankit.setEfirstName("Ankit");
		Ankit.setElastName("Sharma");
		Ankit.setContactNumber(6023785686l);
		Ankit.setEmailAddr("ankit_Sharma23@syntelinc.com");
		System.out.println(Ankit.getElastName() + " " + Ankit.getElastName() + " " + Ankit.getContactNumber() + " " + Ankit.getEmailAddr());
				
		Employee Jessica = new Employee("Jessica", "Siano", 9142999792l, "jessica_siano@syntelinc.com");
		System.out.println(Jessica.getEfirstName() + " " + Jessica.getElastName() + " " + Jessica.getContactNumber() + " " + Jessica.getEmailAddr());
	}
}
