class Average2{
    public static void main(String[] args){
	int[] score;
	score = new int[3];
	score[0] = 53;
	score[1] = 85;
	score[2] = 72;
	int sum = 0;
	for(int i=0; i<score.length; i++){
	    sum += score[i];
	}
	double average = (double)sum/score.length;
	
	System.out.println("合計: " + sum + "点");
	System.out.println("平均: " + average + "点");
    }
}
