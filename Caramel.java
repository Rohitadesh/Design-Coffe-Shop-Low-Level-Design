public class Caramel extends BeverageDecorator{
    private static  final int CaramelAddOnCost=50;
//    Beverage beverage;
    public Caramel(Beverage  beverage){
        super(beverage);
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+" "+"Extra Caramel";
    }
    @Override
    public double getCost(){
        return  beverage.getCost()+CaramelAddOnCost;
    }
}
