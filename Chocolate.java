public class Chocolate extends  BeverageDecorator{
    public static  final int ChocolateAddOnPrice=30;
    Beverage beverage;
    public Chocolate(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription()+" "+"Extra chocolate";
    }
    @Override
    public double getCost(){
        return this.beverage.getCost()+ChocolateAddOnPrice;
    }

}
