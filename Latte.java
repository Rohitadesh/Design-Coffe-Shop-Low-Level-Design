public class Latte extends  Beverage{

    public Latte(String description,double cost){
        this.description=description;
        this.cost=cost;
    }

    @Override
    public double getCost(){
        return cost;
    }

    @Override
    public String getDescription(){
        return description;
    }
}
