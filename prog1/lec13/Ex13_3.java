class Ex13_3{
    public static void main(String[] args){
    int [] score={50,20,33,89,97};
    System.out.println(getSum(score));
}
    public static int getSum(int[] s){
	int sum=0;
	for(int i=0;i<s.length;i++){
	    sum+=s[i];
	}
	return sum;
    }
}
