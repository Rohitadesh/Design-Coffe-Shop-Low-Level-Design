public class Milk extends BeverageDecorator {
    private static final int MilkAddOnPrice = 30;
//    Beverage beverage;
    public Milk(Beverage beverage){
        super(beverage);
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+" "+"Extra Caramel";
    }

    @Override
    public double getCost(){
        return beverage.getCost()+MilkAddOnPrice;
    }

}