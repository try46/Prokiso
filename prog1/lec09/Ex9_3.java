class Ex9_3{
    public static void main(String[] args){
	for(int i=1;i<=9;i++){
	    for(int j=1;j<=9;j++){
		if(i*j>=26){
		    continue;
		}
		System.out.print(i*j+"\t");

		}
		System.out.print("\n");
	}
    }
}
