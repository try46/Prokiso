class Ex10_3{
    public static void main(String[] args){
	int[] a ={10,15,12};
	int[] b = {3,8,13};
	int inPro=0;
	for(int i=0;i<a.length;i++){
	    inPro += a[i]*b[i];
	}
	System.out.println(inPro);
    }
}
