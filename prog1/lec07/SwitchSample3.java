class SwitchSample3{
    public static void main(String[] args){
	int money = 100;
	int numberOfCandies = 0;
	int numberOfPotatoes = 0;
	double water = 0.0;
	switch(money){
	case 100:
	    numberOfCandies++;
	case 50:
	    numberOfPotatoes++;
	    break;
	default:
	    water += 0.5;
	    break;
	}
    }
}
