class NinjaManager{
    public static void main(String[] args){
	Ninja sakura=new Ninja();
	Ninja hinata=new Ninja();
	sakura.setHitPoint(700);
	hinata.setHitPoint(500);
	sakura.setLoyalty(300.0);
	hinata.setLoyalty(200.0);
	System.out.println(sakura.getHitPoint());
	System.out.println(hinata.getHitPoint());
	System.out.println(sakura.getLoyalty());
	System.out.println(hinata.getLoyalty());
    }
}
