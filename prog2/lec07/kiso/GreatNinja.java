class GreatNinja extends Ninja{
    public void setHitPoint(int hitPoint){
    super.setHitPoint(hitPoint);//スーパークラス(Ninja.java)のsetHitPointを呼び出し
	this.hitPoint=hitPoint+40;
    }

}
