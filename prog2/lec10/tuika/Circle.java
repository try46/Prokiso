class Circle extends Figure{
	protected double radius;
	public Circle(double r){
		this.radius=r;
	}
	@Override
	public double getArea(){
		return (Math.PI)*(radius*radius);
	}
}


