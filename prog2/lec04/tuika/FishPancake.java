class FishPancake{
    private static int income;
    private static int outgo;
    private static int fixedCost=10;
    private static int priceOfBeanJam=500;
    private static double kca1OfBeanJam=2.4; //追加 
    private static double fixedKcal=80.0; //追加 
    private int price;
    private int ml;
    private double kcal; //追加

    public FishPancake(int price , int ml){
	this.price=price;
	this.ml=ml;
	outgo +=fixedCost + ml * priceOfBeanJam/1000;
    }
    public void sell(){
	income +=price;
    }

    public static int profit(){
	return income-outgo;
    }
public double eat(){ //追加

}



