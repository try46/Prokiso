class DisplayScore{
    public static void main(String[] args){
	int[][] score = new int[2][3];
	score[0][0]=53;
	score[0][1]=85;
	score[0][2]=72;
	score[1][0]=63;
	score[1][1]=55;
	score[1][2]=93;
	for(int i=0; i<score.length; i++){
	    for(int j=0; j<score[i].length; j++){
		System.out.println((i+1) + "番目の学生の"
				   + (j+1) + "回目の点数: " + score[i][j]);
	    }
	}
    }
}
