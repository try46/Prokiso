class NinjaManager{
    public static void main(String[] args){
	Ninja hanzo=new Ninja();
	hanzo.setHitPoint(700);

	Ninja jouun=new Ninja();
	jouun.setHitPoint(400);

	System.out.println(hanzo.getHitPoint());
	System.out.println(jouun.getHitPoint());
    }
}
