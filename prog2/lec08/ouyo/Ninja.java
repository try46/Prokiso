//これはスーパークラス
class Ninja{
    protected int hitPoint;
    protected double loyalty;
    private static int sum=0;
    private Ninja(){
	sum++;
    }
    public Ninja(int hitPoint,double loyalty){
	this();
	this.hitPoint=hitPoint;
	this.loyalty=loyalty;
    }
    public void work(){
	this.hitPoint-=30;
	this.loyalty+=5.0;
	return;
    }
    public int getHitPoint(){
	return this.hitPoint;
    }
    public double getLoyalty(){
	return this.loyalty;
    }
    public static final int getSum(){
	return sum;
    }
}
