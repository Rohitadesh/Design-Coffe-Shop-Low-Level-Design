
public class CoffeShop{
    public static void main(String[] args){
        Beverage espresso = new Espresso("Espresso",50);
        espresso=new Milk(espresso);
        espresso= new Caramel(espresso);

        System.out.print(espresso.getDescription()+ " "+espresso.getCost());
        System.out.println();
        Beverage latte = new Latte("Latte",40);
        latte = new Caramel(latte);
        System.out.println(latte.getDescription()+ " "+latte.getCost());
    }
}