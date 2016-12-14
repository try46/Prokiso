class Ex15_9{
    public static void main(String[] args){
	int a=10;
	int b = 2;
	int num=multiNum(a,b);
	if(num>=20&&b<=10){
	    System.out.println("Excellent!");
	}else if(num>=10){
	    System.out.println("Good!");
	}else{
	    System.out.println("Bad!");
	}
    }
	public static int multiNum(int a,int b){
	 return a*b;
	}
}

