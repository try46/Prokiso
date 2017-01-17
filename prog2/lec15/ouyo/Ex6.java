class Ex6{
	public static void main(String[] args){
		Stone s=new Gem();
		Diamond d=new Diamond();
		Gem g=new Diamond();
		System.out.println(((Diamond)g).hardness);
	}
}

