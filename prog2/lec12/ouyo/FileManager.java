import java.io.*;
public class FileManager {	    
    public static void main(String[] args) {
		 boolean isOdd=true;

	try{
		BufferedReader br=new BufferedReader(new FileReader("studen.txt"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("aclass1.txt")));
				
	    while(true){
			String str=br.readLine();//home/c011610353/prog2/lec12/tuika/FileManager2.java
		if( Integer.parseInt(str)==-1){
			Integer.parseInt(str);
			pw.println(-1);
			pw.close();
			break;
		}else if(isOdd){
			
		    pw.println();
		  }
isOdd=!isOdd;
		}
	    br.close();
	}
	catch(IOException e){
	    System.out.println("Error");

	}

    }
}

