class NinjaManager{
    public static void main(String[] args){
	Ninja hanzo=new Ninja();
	hanzo.setHitPoint(700);
	hanzo.setLoyalty(300.0);
	Ninja jouun=new Ninja();
	jouun.setHitPoint(400);
	jouun.setLoyalty(-50.0);

	System.out.println(hanzo.getHitPoint());
	System.out.println(jouun.getHitPoint());
	System.out.println(hanzo.getLoyalty());
	System.out.println(jouun.getLoyalty());

    }
}
