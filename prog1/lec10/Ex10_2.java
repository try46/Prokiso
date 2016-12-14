class Ex10_2{
    public static void main(String[] args){
	int[] score={25,50,60,92,19};
	int max = score[0];
	int max_i = 0;
	for(int i=0;i<score.length;i++){
	    if(max<=score[i]){
		max=score[i];
		max_i=i;

	    }
	}
	System.out.println("最大値" + max);
	System.out.println("要素番号" + max_i);
    }
}
