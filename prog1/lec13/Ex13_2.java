class Ex13_2{
    public static void main(String[] args){
	int price=201;
	double rate=0.185;
	System.out.println(getTax(price,rate));
    }
    public static int getTax(int p,double r){
	return (int)(p*r);
    }
}
