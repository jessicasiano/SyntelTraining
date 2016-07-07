class array{
	public static void main(String[] ar){
		//datatype[] nameOfArray = new datatype[size];
		int[] nums = new int[10]; //an array of 10 ints
		String[] words = new String[100]; //an array of 100 words
		for(int i = 0; i < 10; i++){
			nums[i] = i*100;
		}
		for(int i = 0; i < 10; i++){
			System.out.println(nums[i]);
		}
		System.out.println("");
		int[] newnums = new int[]{10, 12, 34, 5, 78, 90};
		for(int i = 0; i < 6; i++){
			System.out.println(newnums[i]);
		}
		System.out.println("");
		int[] newernums = {25, 58, 47, 69, 36, 15};
		for(int i = 0; i < 6; i++){
			System.out.println(newernums[i]);
		}
		System.out.println("");
		
	}
}