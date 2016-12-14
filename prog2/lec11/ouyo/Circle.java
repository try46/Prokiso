class Circle{
    private double radius;
    public Circle(){
	radius=2.0;
    }

    public void setR(double r)throws CircleException{
	if(r<=0){
	    CircleException e=new CircleException();
	    throw e;
	}else{
	    radius=r;
	}
    }
	public double getR(){
	    return radius;
	}
	public double getArea(){
	    return Math.PI*radius*radius;
	}
    }

