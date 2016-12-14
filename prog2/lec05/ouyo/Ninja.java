class Ninja{
    private int hitPoint;
    private double loyalty;
    public static int numOfNinjas;

    private  Ninja(){
	hitPoint=999;
	loyalty=100.0;
	numOfNinjas++;	
    }
    public Ninja(int hitPoint){
	this();
	this.hitPoint=hitPoint;
	
    } 
    public Ninja(double loyalty){
	this();
	this.loyalty=loyalty;
    }
  
public static int  getNumOfNinjas(){
	return numOfNinjas++;
}
    public void setHitPoint(int hitPoint){
	this.hitPoint=hitPoint;
	return;
    }
    public void setLoyalty(double loyalty){
	this.loyalty=loyalty;
	return;
    }
    public int getHitPoint(){
	return hitPoint;
    }
    public double getLoyalty(){
	return loyalty;
    }
   

}
