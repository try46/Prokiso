class Average4{
    public static void main(String[] args){
	int[] score = {53, 85, 72};
	int sum = 0;
	for(int i=0; i<score.length; i++){
	    sum += score[i];
	}
	double average = sum/3.0;
	System.out.println("合計: " + sum + "点");
	System.out.println("平均: " + average + "点");
    }
}
