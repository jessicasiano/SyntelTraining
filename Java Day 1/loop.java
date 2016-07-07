class loop{
	public static void main(String[] ar){
		for(int i = 0; i < 10; i++)
			System.out.println(i*2);
		System.out.println("This is outside of the loop");
		
		int i = 1;
		while(i != 0){
			Console console = System.console();
			String input = console.readLine("Enter input:");
			i = reader.nextInt();
		}
	}
}