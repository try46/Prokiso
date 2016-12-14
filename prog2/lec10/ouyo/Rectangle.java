class Rectangle extends Figure implements Resize{
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
	@Override
	public void makeHalf(){
		width= width/2;
	}

}		
