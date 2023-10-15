class PepperoniDecorator extends PizzaDecorator {
    private String name;
    private int price;
    private int size;
    PizzaComponent pizzaComponent;
    public PepperoniDecorator(PizzaComponent pizzaComponent) {
        this.pizzaComponent=pizzaComponent;
        name = "페페로니";
        price = 5000;
        size = pizzaComponent.getSize();
    }
    @Override
    public int getSize() {
        return size;
    }

    public String getName() { return name + pizzaComponent.getName(); }
    public int getPrice() { return price + pizzaComponent.getPrice(); }
}