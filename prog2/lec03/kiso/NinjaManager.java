class NinjaManager{
    public static void main(String[] args){
	Ninja sakura = new Ninja();
	sakura.sethitPoint(300);
	
	Ninja hinata = new Ninja();
	hinata.sethitPoint(500);
	
	System.out.println(sakura.gethitPoint());
	System.out.println(hinata.gethitPoint());
    }
}
