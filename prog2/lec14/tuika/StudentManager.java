class StudentManager{
public static void main(String[] args){
	Human[] humans=new Human[3];
	
	humans[0]=new Assistant(12345678,1000);
	humans[1]=new Student();
	humans[2]=humans[0];
try{
	((Assistant)humans[2]).setAssistantID(-1);
}

catch(AssistantIDOutOfRangeException e){
	 System.out.println(e.getAssistantID());
	}

	System.out.println(((Assistant)humans[2]).getAssistantID());
}
}

