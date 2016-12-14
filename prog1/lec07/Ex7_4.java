class Ex7_4{
    public static void main(String[] args){
	char bld1 = 'A';
	char bld2 = 'B';
	if(((bld1=='A' && bld2=='O') 
	|| (bld1=='O' && bld2=='A') 
	|| (bld1=='A' && bld2=='A'))){
	    System.out.println("A型");
	}else if(((bld1=='B' && bld2=='O') 
	|| (bld1=='O' && bld2=='B') 
	|| (bld1=='B' && bld2=='B'))) {
	    System.out.println("B型");
	}else if((bld1=='A' && bld2=='B') 
	|| (bld1=='B' && bld2=='A')){
	    System.out.println("AB型");
	}else if(bld1=='O' && bld2=='O'){
	    System.out.println("O型");
	}
    }
}
