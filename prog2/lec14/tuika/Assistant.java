public class Assistant extends Student {
	private int assistantID;
	
	public Assistant(){
		this.assistantID=this.studentID;
		this.money=0;
	}

public Assistant(int a,int m){
	this.assistantID=a;
	this.money=m;
}

	public void setAssistantID(int assistantID) throws AssistantIDOutOfRangeException{
		if(assistantID<0||assistantID>=100000000){
			AssistantIDOutOfRangeException e=new AssistantIDOutOfRangeException(-1);
			throw e;
		}
		else{

		this.assistantID=assistantID;
	}
	return;
}
	public int getAssistantID(){
		return assistantID;
	}

	public void help(){
		this.money+=1000;
		return;
	}
}
