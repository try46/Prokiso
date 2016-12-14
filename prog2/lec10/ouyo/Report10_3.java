class Report10_3{

	public static void main(String[] args){
		Rectangle r=new Rectangle(2.5,4.0);
		Circle c =new Circle(1.0);
		System.out.println(c.getArea());
		System.out.println(r.getArea());
		r.makeHalf();
		System.out.println(r.getArea());

		
	}
}

