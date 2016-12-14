class Ex12_3{
    public static void main(String[] args){
	int[] nums={2,3,4};
	makeSequence(nums);
    }
    public static void makeSequence(int[] n){
	for(int i=0;i<n.length;i++){
	    for(int j=4;j<=36;j+=4){
		System.out.println(n[i]*j);
	    }
	}
    }
}

