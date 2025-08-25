public class Chocolate extends  BeverageDecorator{
    public static  final int ChocolateAddOnPrice=30;
//    Beverage beverage;
    public Chocolate(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription(){
        return beverage.getDescription()+" "+"Extra chocolate";
    }
    @Override
    public double getCost(){
        return beverage.getCost()+ChocolateAddOnPrice;
    }

}
