class SwitchSample{
    public static void main(String[] args){
	int money = 90;
	int numberOfCandies = 0;
	int numberOfPotatoes = 0;
	double water = 0.0;
	switch(money){
	case 100:
	    numberOfCandies++;
	    break;
	case 50:
	    numberOfPotatoes++;
	    break;
	default:
	    water += 0.5;
	    break;
	}
    }
}
