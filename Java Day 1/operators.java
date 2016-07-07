class operators{
	public static void main(String[] ar){
		int i = 5;
		int j = 10;
		int k = (j++*2)*j/i--;
		//k=40
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}