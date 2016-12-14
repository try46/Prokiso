class NinjaManager{
    public static void main(String[] args){
	Ninja[] ninjas=new Ninja[2];//Ninja型のninjas型の配列作る配列の要素数は2
	ninjas[0]=new Ninja();//配列の要素を作成(インスタンスを作る)
	ninjas[1]=new Ninja(); //配列の要素を作成(インスタンスを作る)
	ninjas[0].setName("Naruto");//nijas[0](Naruto)をsetNameを使ってNarutoにする
	ninjas[1].setName("Sasuke");//ninjas[1](Sasuke)をsetNameを使ってSasukeにする
	ninjas[1].setHitPoint(500);//ninjas[1](Sasuke)のhitPointを500に設定
	Kunai myKunai=new Kunai(3);//コンストラクタの呼び出し＆インスタンスの作成 (int型の実引数3)
	System.out.println(myKunai.getSharpness());//
	ninjas[0].shoot(myKunai);//
	System.out.println(myKunai.getSharpness());//
	ninjas[1].shoot(myKunai);//
	System.out.println(myKunai.getSharpness());//
	System.out.println(ninjas[0].getName());//
	System.out.println(ninjas[1].getName());//
	System.out.println(ninjas[0].getHitPoint());//
	System.out.println(ninjas[1].getHitPoint());//
    }
}
