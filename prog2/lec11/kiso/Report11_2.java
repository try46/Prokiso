class Report11_2{
    public static void main(String[] args){
	Except1 ex1=new Except1();
	try{
	    ex1.func1();
	}
	catch(Exception e){
	    ;
	}
	finally{
	    Except2.func2();
	    System.out.println("N");
	}
	System.out.println("O");
    }
}
