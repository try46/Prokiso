class Ex15_7{
    public static void main(String[] args){
	int n=3;
	double b =1.5;
	System.out.println(method(n));  //仮引数はint nで実引数はn、method(int n)が呼び出されている
	System.out.println(method(b)); //仮引数はdouble bで実引数はb、method(double b)が呼び出されている
	System.out.println(method(n,b));//仮引数はint n,double bで実引数はn,bでmethod(n,b)が呼び出されている
    }
    public static double method(int n){
	return n/2.0;
    }
    public static double method(double b){
	return b/2.0;
    }
    public static double method(int n, double b){
	return n/b;
    }
}

