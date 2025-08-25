public class Milk extends BeverageDecorator {
    private static final int MilkAddOnPrice = 30;
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription(){
        return this.beverage.getDescription()+" "+"Extra Caramel";
    }

    @Override
    public double getCost(){
        return this.beverage.getCost()+MilkAddOnPrice;
    }

}