class EchoWhileBreak{
    public static void main(String[] args){
	int i; // 繰り返しのための変数
	i = 0;
	while(true){
	    if(i==5){
		break;
	    }
	    System.out.println("ヤッホー");
	    i++;
	}
    }
}
