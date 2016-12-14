class F{
    public static void main(String[] args){
	int priceAdult = 1000;
	int priceChild = 600;
	double priceUsd = 9.80;
	writePrice(priceAdult);
	writePrice(priceAdult, priceChild);
	writePrice(priceUsd);
    }

    public static void writePrice(int p) {
	System.out.println("大人は" + p + "円です");
	System.out.println("子供は" + p/2 + "円です");
	return;
    }

    public static void writePrice(double p) {
	System.out.println("大人は" + p + "ドルです");
	System.out.println("子供は" + p/2 + "ドルです");
	return;
    }

    public static void writePrice(int pa, int pc) {
	System.out.println("大人は" + pa + "円です");
	System.out.println("子供は" + pc + "円です");
	return;
    }
}
