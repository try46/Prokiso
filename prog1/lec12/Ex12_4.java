class Ex12_4{
    public static void main(String[] args){
	int[] nums={2,3,4};
	addNums(nums);
    }
    public static void addNums(int[]  n){
	int sum=0;
	for(int i=0;i<n.length;i++){
	    sum+=n[i];
	}
	System.out.println(sum);
	return;
    }
}
