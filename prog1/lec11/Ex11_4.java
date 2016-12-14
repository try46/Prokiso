class Ex11_4{
    public static void main(String[] args){
	int [][] score={{74,92,65},{83,55,78},{65,88,45},{81,75,88}};
	int []min=new int [score.length];
	for(int j = 0;j<score[j].length;j++){
	    min[j]=score[j][0];
	    for(int i =0;i<score.length;i++){
		if(min[j]>score[i][j]){
		    min[j]=score[i][j];
		}
	    }
	}
	for(int j=0;j<score[j].length;j++){
		System.out.println((j+1)+"回目のテストの最低点:"+min[j]+"点");
	}
    }
}
