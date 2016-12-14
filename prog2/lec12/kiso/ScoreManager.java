import java.io.*;
class ScoreManager{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str=br.readLine();
			if(Integer.parseInt(str)==-1){
			
				System.out.println("END");
				break;
			}
			else{
				System.out.println(str);
			}
		}
	}
}

