class Ninja{
    int hitPoint;
    void setHitPoint(int hitPoint){
	this.hitPoint=hitPoint;
	return;
}
    int getHitPoint(){
	return hitPoint;
    }
    double loyalty;
    void setLoyalty(double loyalty){
	if(loyalty<0.0){
	    this.loyalty=0.0;
	}else if(loyalty>100.0){
	    this.loyalty=100.0;
	}else{
       this.loyalty=loyalty;
	}
	return;
    }
    double getLoyalty(){
	return loyalty;
    }
}

