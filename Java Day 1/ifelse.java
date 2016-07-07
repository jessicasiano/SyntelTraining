class ifelse{
	public static void main(String[] ar){
		int empid = 5024282;
		String name = "Jessica Siano";
		String city = "Phoenix";
		float weeklySalary = 961.54f;
		if(empid == 5024282 && name.equals("Jessica Siano") && weeklySalary == 961.54f)
			System.out.println("Expected");
		else
			System.out.println("Unexpected");
		
		int choice = 1;
		switch(choice){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("Not 1 or 2");
				break
			
		}
			
	}
}