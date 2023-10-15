class PotatoDecorator extends PizzaDecorator {
    String name;
    int price;
    int size;
    PizzaComponent pizzaComponent;
    public PotatoDecorator(PizzaComponent pizzaComponent) {
        this.pizzaComponent=pizzaComponent;
        name = "감자";
        price = 6000;
        size=pizzaComponent.getSize();
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getName() { return name + pizzaComponent.getName(); }
    public int getPrice() { return price + pizzaComponent.getPrice(); }
}