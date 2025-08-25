abstract public class BeverageDecorator extends Beverage {
    protected final Beverage beverage;
    public BeverageDecorator(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription();
    }
}
