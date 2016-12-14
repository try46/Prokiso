//これはサブクラス
class GreatNinja extends Ninja{//Ninja.javaを継承

   
    private static final int BONUSPOINT=40;//BONUSPOINTの値を40で固定

    public GreatNinja(){//引数のないコンストラクタ
	this.hitPoint+=BONUSPOINT;
 }
    public GreatNinja(int hitPoint){//int型の仮引数を一つ持つコンストラクタ
	super(hitPoint);//スーパークラス(Ninja.java)のhitPointを呼び出し
	this.hitPoint+=BONUSPOINT;

    }

    public void setHitPoint(int hitPoint){
    super.setHitPoint(hitPoint);//スーパークラス(Ninja.java)のsetHitPointメソッドを呼び出し
	this.hitPoint+=BONUSPOINT;
    }
    
}

