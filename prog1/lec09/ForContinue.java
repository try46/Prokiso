class ForContinue{
    public static void main(String[] args){
	int i; //繰り返しのための変数
	for(i=1; i<=5; i++){
	    System.out.println(i + " (前)");
	    if(i>2){
		continue;
	    }
	    System.out.println(i + " (後)");
	}
    }
}
