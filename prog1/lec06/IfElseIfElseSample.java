class IfElseIfElseSample{
  public static void main(String[] args){
    int money = 90;
    int numberOfCandies = 0;
    int numberOfPotatoes = 0;
    double water = 0.0;
    if(money >= 100){
      numberOfCandies++;
    }else if(money >= 50){
      numberOfPotatoes++;
    }else{
      water += 0.5;
    }
  }
}
