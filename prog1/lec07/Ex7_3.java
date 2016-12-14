class Ex7_3{
    public static void main(String[] args){
	int a = 15;
	char range ;

	switch(a/7){
	case 0:
	    range='A';
	break;
	case 1:
	    range = 'B';
	    break;
	case 2:
	    range = 'C';
	    break;
	default:
	    range='D';
    break;
	}
    System.out.println(range);
    }
}
	
