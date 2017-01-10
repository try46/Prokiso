public class Assistant extends Student{
	private int assistantID;
	
	public Assistant(){
		this.assistantID=this.studentID;
		this.money=0;
	}

public Assistant(int a,int m){
	this.assistantID=a;
	this.money=m;
}

	public void setAssistantID(int assistantID){
		this.assistantID=assistantID;
	}

	public int getAssistantID(){
		return assistantID;
	}

	public void help(){
		this.money+=1000;
		return;
	}
}

