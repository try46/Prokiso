class Ex15_8{
    public static void main(String[] args){
	int[] [] n={{2,7},{6,9,5,1},{4,3,8}};
	calcAve(n);

    }
    public static void calcAve(int[][] n){
	for(int i=0;i<n.length;i++){
	    double sum=0;
	    for(int j =0;j<n[i].length;j++){
		sum+=n[i][j];
	    }
	    System.out.println(sum/n[i].length);

	}
    }
}

