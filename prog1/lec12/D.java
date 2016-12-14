class D{
    public static void main(String[] args){
	int[] prices = {1000, 1800, 2600}; //1名料金, 2名料金, 3名料金
	writePrice(prices);
    }
    public static void writePrice(int[] p) {
	System.out.println("いらっしゃいませ");
	for(int i=0; i<p.length; i++) {
	    System.out.println((i+1) + "名なら" + p[i] + "円です");
	}
	return;
    }
}
