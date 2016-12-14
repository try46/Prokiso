class Except1{
    int []test =new int[5];
    public void func1(){
	try{
	    for(int i=0;i<10;i++){
		test[i]=i;
	    }
	}
	    catch(Exception e){
		System.out.println("N");	
	    }
	    finally{
		System.out.println("A");
	    }
	}
 }
