class Ex11_3{
    public static void main(String[] args){
	int[][]score={{74,92,65},{83,55,78},{65,88,45},{81,75,88}};
	int[] min =new int[score.length];
	for(int i = 0;i<score.length;i++){
	    min[i]=score[i][0];
	    for(int j = 0;j<score[i].length;j++){
		if(min[i]>score[i][j]){
		    min[i]=score[i][j];
		}
	    }
	}
	for(int i =0;i<score.length;i++){
	    System.out.println((i+1)+"人目の学生の最低点:"+min[i]+"点");
	}
    }
}
