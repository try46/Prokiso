class Report11_4{
    public static void main(String[] args){
	Circle [] circles=new Circle[7];
	for(int i=0;i<circles.length;i++){
	    circles[i]=new Circle();

	    try{
		circles[i].setR(-3.0+(double)i);
	    }
	
	catch(CircleException e){
	    System.out.println("設定値が"+e.getR()+"なので半径は変更しない");
	}
    
	    System.out.println("半径"+circles[i].getR()+"の面積は"+circles[i].getArea());
	}
    }
}
