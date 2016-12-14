class NinjaManager{
    public static void main(String[] args){
	Ninja[] ninjas=new Ninja[2];

	ninjas[0] =new Ninja(300,50.0);
	Kunai noName=new Kunai(100);
	ninjas[1] =new GreatNinja(700,80.0,noName);
	for(int i=0;i<ninjas.length;i++){
	ninjas[i].work();
	}
	System.out.println(ninjas[0].getHitPoint());
	System.out.println(ninjas[0].getLoyalty());
	System.out.println(ninjas[1].getHitPoint());
	System.out.println(ninjas[1].getLoyalty());
	System.out.println(noName.getSharpness());
    }
}
