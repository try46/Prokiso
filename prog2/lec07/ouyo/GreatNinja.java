//これはサブクラス
class GreatNinja extends Ninja{
    public GreatNinja(){//引数無しのGreatNinjaクラスのコンストラクタ
	
 }
    public GreatNinja(int hitPoint){//int型の引数を持つGreatNinjaクラスのコンストラクタ
	super(hitPoint);
	this.hitPoint+=40;

    }
    public void setHitPoint(int hitPoint){
    super.setHitPoint(hitPoint);//スーパークラス(Ninja.java)のsetHitPointメソッドを呼び出し
	this.hitPoint+=40;
    }

}
