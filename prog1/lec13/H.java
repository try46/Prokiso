class H{
    public static void main(String[] args){
	int priceAdult = 1000;
	double rate = 0.8;
	int priceChild = calcPrice(priceAdult, rate);
	System.out.println("大人は" + priceAdult + "円です");
	System.out.println("子供は" + priceChild + "円です");
    }
    public static int calcPrice(int pa, double r) {
	return (int)(pa*r);
    }
}
