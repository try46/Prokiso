class Ninja{
    private int hitPoint;
    private String name;
    public Ninja(){
	hitPoint=300;
	name="No name";
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
