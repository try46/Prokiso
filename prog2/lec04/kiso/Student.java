class Student{
    private String id;
    private double height;
    private double weight;
    public static int total;
    
    public Student(String id,double h,double w ){
	this.id=id;
	height=h;
	weight=w;
	total++;
    }
    public double  getBMI(){
	return dweight/height/height*10000;
   
    }

    public String getID(){
	return id;
    }
    public static int getCount(){
	return total;
    }

}



