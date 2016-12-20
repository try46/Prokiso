public class Student{
    private int studentID;
    private String name;

    private Student(){
	
	this.studentID=99999999;
	this.name="John";
    }
    public Student(int studentID){
		this();
	if(studentID<=0||studentID>=100000000){
	    studentID=99999999;
	}
	else{
		this.studentID=studentID;
	}
    }
    public Student(int studentID,String name){
		this();
	if(studentID<=0||studentID>=100000000){
			   
	    studentID=99999999;
				  
	}else{
	    this.studentID=studentID;
	    this.name=name;
	}
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

