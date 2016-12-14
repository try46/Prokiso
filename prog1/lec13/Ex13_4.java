class Ex13_4{
    public static void main(String[] args){
	int [] score={50,20,33,89,97};
	System.out.println(getAverage(score));
    }
    public static double getAverage(int[] s){
	int sum=0;
	for(int i =0; i<s.length;i++){
	    sum+=s[i];
	}
	return (sum/(double)s.length);
    }
}
