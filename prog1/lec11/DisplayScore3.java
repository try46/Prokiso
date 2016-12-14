class DisplayScore3{
    public static void main(String[] args){
	int[][] score = {{20,30,10},{30,40},{10,10,20,10,5}};
	for(int i=0; i<score.length; i++){
	    System.out.println((i+1) + "回目のテスト");
	    for(int j=0; j<score[i].length; j++){
		System.out.println("("+ (j+1) + ") "
				   + score[i][j] + "点");
	    }
	}
    }
}
