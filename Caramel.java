public class Caramel extends BeverageDecorator{
    private static  final int CaramelAddOnCost=50;
    Beverage beverage;
    public Caramel(Beverage  beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription(){
        return this.beverage.getDescription()+" "+"Extra Caramel";
    }
    @Override
    public double getCost(){
        return  this.beverage.getCost()+CaramelAddOnCost;
    }
}
