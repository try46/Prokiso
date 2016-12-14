class Ninja{
    private int hitPoint;
    private double loyalty;
    public Ninja(){
	hitPoint=300;
    }
    public Ninja(int hitPoint){
	this.hitPoint=hitPoint;
    }
    public Ninja(int hitPoint,double loyalty){
	   if(loyalty>100.0){
	    this.loyalty=100.0;
	}else if(loyalty<0.0){
	    this.loyalty=0.0;
	}else{
       this.loyalty=loyalty;
	}
	return;
    }
    public void setHitPoint(int hitPoint){
	this.hitPoint = hitPoint;
	return;
    }
    
    public int getHitPoint(){
	return hitPoint;
    }
    public void setLoyalty(double loyalty){
	this.loyalty=loyalty;
	return;
    }
    public double getLoyalty(){
	return loyalty;
    }
}
