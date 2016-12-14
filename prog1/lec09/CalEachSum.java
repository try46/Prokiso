class CalEachSum{
    public static void main(String[] args){
	int osum, esum; // 合計値
	osum = esum = 0;
	for(int i=1; i<=10; i++){
	    if(i%2==0){
		esum += i;
	    }else{
		osum += i;
	    }
	}
	System.out.println("osum: " + osum);
	System.out.println("esum: " + esum);
    }
}
