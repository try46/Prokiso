class E{ 
    public static void main(String[] args){
	int price_adult = 1000;
	int price_child = 600;
	writePrice(price_adult, price_child);
    }
    public static void writePrice(int p_a, int p_c){
	System.out.println("いらっしゃいませ");
	System.out.println("大人は" + p_a + "円です");
	System.out.println("子供は" + p_c + "円です");
	return;
    }
}
