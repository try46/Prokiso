class StudentManager{
public static void main(String[] args){
	Human[] humans=new Human[3];
	
	humans[0]=new Assistant();
	humans[1]=new Student();
	humans[2]= humans[0];

	System.out.println(((Assistant)humans[2]).getAssistantID());
}
}

