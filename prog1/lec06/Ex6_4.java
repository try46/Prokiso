class Ex6_4{
    public static void main(String[] args){
	int a = 3;
	int b = 8;
	int c = 10;
	if(a < 8){
	    b++;
	}else if(a > 8){
	    c--;
	}else if(b==8){
	    b=b+c;
	}
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
    }
}
