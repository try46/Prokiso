//これはスーパークラス
class Ninja{
    protected int hitPoint;
    public Ninja(){         //引数のないコンストラクタ
	this.hitPoint=400;
    }
    public Ninja(int hitPoint){//int型の仮引数を持つコンストラクタ
	this.hitPoint=hitPoint;
    }
    public void setHitPoint(int hitPoint){
	this.hitPoint=hitPoint;
	return;
    }
    public int getHitPoint(){
	return this.hitPoint;
    }
}
