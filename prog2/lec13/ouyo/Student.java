public class Student{
	private int studentID;
	private String name;
	
	private Student(){
		this.studentID=99999999;
		this.name="John";
	}
	public Student(int studentID){
		this();
		this.studentID=studentID;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getStudentID(){
		return studentID;
	}
	public String getName(){
		return name;
	}
}
