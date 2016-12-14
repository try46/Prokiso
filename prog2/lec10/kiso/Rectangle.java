class Rectangle extends Figure{
	protected double width ;
	protected double height;

	public Rectangle(double w,double h){
		this.width=w;
		this.height=h;
	}
	@Override
	public double getArea(){
		return width*height;
	}
}		
