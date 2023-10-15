public class BulgogiDecorator extends PizzaDecorator{
    private String name;
    private int price;
    private int size;
    PizzaComponent pizzaComponent;
    public BulgogiDecorator(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        name = "블고기";
        price = 3000;
        size = pizzaComponent.getSize();
    }

    public String getName() { return name + pizzaComponent.getName(); }
    public int getPrice() { return price + pizzaComponent.getPrice(); }
    @Override
    public int getSize() {
        return size;
    }
}
