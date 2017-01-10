public class Student extends Human{
	protected int studentID;

	public Student(){
		this.studentID=99999999;
		this.money=0;
	}

	public void setStudentID(int studentID){
		this.studentID=studentID;
		return;
	}
	
	public int getStudentID(){
		return studentID;
	}

	@Override
	public void help(){
		return;
	}


}

