class Ninja{
    private int hitPoint;
    private double loyalty;
    public Ninja(){
	hitPoint=300;
    }
    public Ninja(int hitPoint){
	this.hitPoint=hitPoint;
    }
    public Ninja(double loyalty){
      
	if(loyalty>=100.0){
	    loyalty=100.0;
	}	else if(loyalty<0.0){
	    loyalty=0.0;
	}else{
	    this.loyalty=loyalty;
	}
    }
	    
	    
    

	    
	    public void sethitPoint(int hitPoint){
		this.hitPoint = hitPoint;
		return;
	    }
    
	    public int getHitPoint(){
		return hitPoint;
	    }
	    }
