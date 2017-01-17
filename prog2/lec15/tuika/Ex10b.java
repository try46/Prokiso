class Ex10b{
	public static void main(String[] args){
		int[] x={1,4,3,2};
		for(int i=0;i<x.length;i++){
			for(int j=0;j<i;j++){
				if(j==x[i])
					System.out.println(x[i]);
			}
		}
	}
}

