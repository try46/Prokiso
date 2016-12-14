class Ex8_4{
    public static void main(String[] args){
	double pi = 1.0;
	int denom1=3;
	int denom2=5;
	for(int i= 0;i<100000;i++){
	    pi -=1.0/denom1;
	    pi +=1.0/denom2;
	    denom1 +=4;
	    denom2 +=4;
	}
	pi *=4;
	System.out.println(pi);
    }
}
