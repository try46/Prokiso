class C{
    public static void main(String[] args){
	writePrice(1000);
    }
    public static void writePrice(int p) {
	System.out.println("いらっしゃいませ");
	System.out.println("大人は" + p + "円です");
	System.out.println("子供は" + p/2 + "円です");
	return;
    }
}
