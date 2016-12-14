class CircleException extends Exception{
private double radius;
public CircleException(double r){
	radius=r;
}
public double getR(){
	return radius;
}
}

