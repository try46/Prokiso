import java.util.Random;
class Report62{
    public static void main(String[] args){
	int[] nums=new int[3];
       
	Random r=new Random();
	for(int i=0; i<3;i++){

	    nums[i]=r.nextInt(9)+3;
	    System.out.println(nums[i]);
	}   
       
    }
}
