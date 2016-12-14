class Report42{
    public static void main(String[] args){
	System.out.println("学生数" + Student.getCount());
	Student st1=new Student("A000", 143.0,41.0);
	Student st2=new Student("A001", 185.0,63.0);

       
	System.out.println("ID: " + st1.getID() + ", BMI: " + st1.getBMI());
	System.out.println("ID: " + st2.getID() + ", BMI: " + st2.getBMI());
	System.out.println("学生数" + Student.getCount());
    }
}
