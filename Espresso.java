public class Espresso extends Beverage{

    public Espresso(String description,double cost){
        this.description= description;
        this.cost=cost;
    }



    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
