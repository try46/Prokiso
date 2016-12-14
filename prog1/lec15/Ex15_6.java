class Ex15_6{
    public static void main(String[] args){
	int [] a ={1,3,5};
	int [] b = {2,4,6};
	int [] c=a;
	int [] d = new int[3];
	for(int i=0;i<d.length;i++){
	    d[i]+=a[i]+b[i]+c[i];
	    System.out.println(d[i]);
	}
    }
}
