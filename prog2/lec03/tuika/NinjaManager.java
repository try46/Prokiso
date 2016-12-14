class NinjaManager{
    public static void main(String[] args){

	Ninja sakura=new Ninja();
	Ninja hinata=new Ninja(500);
	Ninja hanzo=new Ninja();
	hanzo.setLoyalty(300.0);
	Ninja jouun=new Ninja();
	jouun.setLoyalty(-50.0);

	System.out.println(sakura.getHitPoint());
	System.out.println(hinata.getHitPoint());
	System.out.println(hanzo.getLoyalty());
	System.out.println(jouun.getLoyalty());

    }
}
