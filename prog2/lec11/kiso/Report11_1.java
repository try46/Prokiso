class Report11_1{
	public static void main(String[] args){
	    try{		
	int a=3;
	int b=0;
	System.out.println(a+"/"+b+"="+a/b);
	}
	    catch(ArithmeticException e){
		System.out.println("0による除算が発生しました");
	    }
	}
}



