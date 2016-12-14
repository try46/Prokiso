class ScoreManager{
    public static void main(String[] args){
	int [] score={14,56,48,71,99,96};
	int maxScore=-1;
	int sum=0;
	for(int i=0;i<score.length;i++){
	    if(maxScore<score[i]){
		maxScore=score[i];
	    }
	    else{
	    }
	}
	
	    for(int y=0; y<score.length;y++){
		sum+=score[y];
	    }
	    double ave=(double)sum/score.length;
	    System.out.println(maxScore);
	    System.out.println(ave);
	}
}
