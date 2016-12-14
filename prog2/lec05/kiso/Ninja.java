class Ninja{
    private int hitPoint;
    private double loyalty;
    public void hitPoint(){
	hitPoint=999;
	
    }
    public void loyalty(){
	loyalty=100.0;
	
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
