class NinjaManager{
    public static void main(String[] args){
	Ninja[] ninjas=new Ninja[2];//配列作る
	ninjas[0]=new Ninja();
	ninjas[1]=new Ninja(); 
	ninjas[0].setName("Naruto");
	ninjas[1].setName("Sasuke");
	ninjas[1].setHitPoint(500);
	System.out.println(ninjas[0].getName());
	System.out.println(ninjas[1].getName());
	System.out.println(ninjas[0].getHitPoint());
	System.out.println(ninjas[1].getHitPoint());
    }
}
