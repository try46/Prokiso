class Ninja{
    private int hitPoint;
    private String name;
    public Ninja(){
	hitPoint=300;
	name="No name";
    }

    public void  shoot(Kunai myKunai){//Kunai型の変数myKuniaを宣言
	myKunai.used(); //メソッドの呼び出し Kunaiクラスのused()を呼び出す
return;
    }
    public void setHitPoint(int hitPoint){
	this.hitPoint=hitPoint;
	return;
    }
    public void setName(String name){
	this.name=name;
	return;
    }
    public int getHitPoint(){
	return hitPoint;
    }
    public String getName(){
	return name;
    }
}
