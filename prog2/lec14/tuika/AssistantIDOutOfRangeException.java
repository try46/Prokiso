class AssistantIDOutOfRangeException extends Exception{
	int assistantID;
	public AssistantIDOutOfRangeException(int assiatantID){
	    this.assistantID=assiatantID;
	}
    public int getAssistantID(){
	return assistantID;
}
}
