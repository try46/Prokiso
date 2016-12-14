//これはサブクラス
class GreatNinja extends Ninja{
    private Kunai kunai;
    public GreatNinja(int hitPoint,double loyalty,Kunai kunai){
	super(hitPoint,loyalty);
	this.kunai=kunai;
    }
    public void work(){
	super.work();
	kunai.used();
	return;
    }
}
