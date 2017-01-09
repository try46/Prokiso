class Report13_2{

	public static void main(String[] args){
		int [] nums={19,3,25,400,20};
		boolean[] arePrimeNums=new boolean[nums.length];
		for(int i=0;i<nums.length;i++){
		
				if(nums[i]%2==0){
				arePrimeNums[0]=false;
}
arePrimeNums[i]=true;

				}
		

		for(int j=0;j<nums.length;j++){
				System.out.println(nums[j]);
				System.out.println(arePrimeNums[j]);
		}
	}
}



