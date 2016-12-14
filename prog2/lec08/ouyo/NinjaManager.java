class NinjaManager{
    public static void main(String[] args){
	Ninja sakura =new Ninja(300,50.0);
	Kunai noName=new Kunai(100);
	GreatNinja hinata =new GreatNinja(700,80.0,noName);
	sakura.work();
	hinata.work();
	System.out.println(sakura.getHitPoint());
	System.out.println(sakura.getLoyalty());
	System.out.println(hinata.getHitPoint());
	System.out.println(hinata.getLoyalty());
	System.out.println(noName.getSharpness());
    }
}
