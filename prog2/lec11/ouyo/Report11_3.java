class Report11_3{
    public static void main(String[] args){
	Circle c =new Circle();
	try{
	    c.setR(-2.0);
	}
	catch(CircleException e){
	    System.out.println(e);
	}
	finally{
	    System.out.println("半径2.0の円の面積は"+c.getArea());
	}
    }
}
