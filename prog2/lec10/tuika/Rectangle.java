class Rectangle extends Figure implements Resize{

    protected double width ;
    protected double height;
    protected String color;
    public Rectangle(double w,double h){
	this.width=w;
	this.height=h;
    }
    public Rectangle(double w,double h,String c){
	this.width=w;
	this.height=h;
	this.color=c;
    }
    @Override
    public double getArea(){
	return width*height;
    }
    @Override
    public void makeHalf(){
	width= width/2;
    }
    public String getColor(){
	return color;
    }

}		
