class LogicalOperationSample2{
    public static void main(String[] args){
	int money = 120;
	int numberOfCandies = 0;
	char sizeOfCandy = 'M';
	if(money >= 100 
	   && (sizeOfCandy == 'L' || sizeOfCandy == 'M')){
	    numberOfCandies++;
	}
    }
}
