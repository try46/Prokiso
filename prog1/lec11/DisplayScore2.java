class DisplayScore2{
    public static void main(String[] args){
	int[][] score = {{53,85,72},{63,55,93}};
	for(int i=0; i<score.length; i++){
	    for(int j=0; j<score[i].length; j++){
		System.out.println((i+1) + "番目の学生の"
				   + (j+1) + "回目の点数: " + score[i][j]);
	    }
	}
    }
}
