class Report43{
    public static void main(String[] args){
	for(int i=0;i<20;i++){
	    FishPancake cake=new FishPancake(150,80);
	    cake.sell();
	}
	int total=FishPancake.profit();
	System.out.println("トータルの利益"+total+"円でした。");
    }
}
