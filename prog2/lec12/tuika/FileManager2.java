import java.io.*;
public class FileManager2 {	    
    public static void main(String[] args) {
		 boolean isOdd=true;

	try{
	    BufferedReader br=new BufferedReader(new FileReader(args[0]));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
				
	    while(true){
			String str=br.readLine();
			Integer.parseInt(str);
		if( Integer.parseInt(str)==-1){
			Integer.parseInt(str);
			pw.println(-1);
			pw.close();
			break;
		}else if(isOdd){
			
		    pw.println(Integer.parseInt(str)+5);
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

