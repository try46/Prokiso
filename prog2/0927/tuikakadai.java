class tuikakadai{
    public static void main(String[] args){
	int []score= {11,25,98,62,53};
	int tmp=0;
	for(int i=0;i<score.length-1;i++){
	for(int j=0;j<score.length-1;j++){
	    if(score[j]<score[j+1]){
		tmp=score[j];
		score[j]=score[j+1];
		score[j+1]=tmp; 
	    }
	}
	}
	for(int j=0;j<score.length;j++){
	System.out.println(score[j]);
	}
    }
}
