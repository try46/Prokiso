
class Kunai{
    private int sharpness;
    public Kunai(int sharpness){
	this.sharpness=sharpness;
    }
    public int getSharpness(){
	return this.sharpness;
    }
    public void used(){
	sharpness--;
	return;
    }
}
