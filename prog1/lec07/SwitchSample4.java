class SwitchSample4{
    public static void main(String[] args){
	int money = 120;
	int numberOfCandies = 0;
	int numberOfPotatoes = 0;
	double water = 0.0;
	switch(money/50){
	case 0:
	    water += 0.5;
	    break;
	case 1:
	    numberOfPotatoes++;
	    break;
	default:
	    numberOfCandies++;
	    break;
	}
    }
}
