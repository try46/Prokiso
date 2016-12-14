class Ex9_4{
    public static void main(String[] args){
	int day=0;
	int height=0;
	while(true){
	    day++;
	    height+=3;
	    if(height>=10){
		break;
	    }else{
		height-=2;
	    }
	}
	System.out.println(day+"日");
    }
}
