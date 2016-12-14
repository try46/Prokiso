class NinjaManager{
    public static void main(String[] args){
	Ninja[] ninjas=new Ninja[3];//要素数3の配列名ninjasを宣言

	ninjas[0]=new GreatNinja();//引数のないGreatNinjaクラスのコンストラクタを呼び出しインスタンスを作成して代入
	ninjas[1]=new GreatNinja(500);//int型の引数を持つGreatNinjaクラスのコンストラクタを呼び出しインスタンスを作成して代入
	ninjas[2]=new Ninja();//引数なしのNinjaクラスのコンストラクタを呼び出しインスタンスを作成して代入
	for(int i=0;i<ninjas.length;i++){//配列の要素数分回す
	    System.out.println(ninjas[i].getHitPoint());//各配列のhitPointを出力 
	}
    }
}

