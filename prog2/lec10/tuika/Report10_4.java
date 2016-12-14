class Report10_4{
    public static void main(String[] args){
	Figure[] figs=new Figure[2];
	figs[0]=new Rectangle(2.5,4.0,"red");
	figs[1]=new Circle(1.0);
	for(int i=0;i<figs.length;i++){
	       
	    if(figs[i] instanceof Rectangle){
		System.out.println(figs[i].getArea());
		System.out.println(((Rectangle)figs[i]).getColor());
	}
	if(figs[i] instanceof Circle){
	    System.out.println(figs[i].getArea());
	}
    }
	}
}

