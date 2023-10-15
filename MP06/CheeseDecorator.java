class CheeseDecorator extends PizzaDecorator {
    private String name;
    private int price;
    private int size;
    PizzaComponent pizzaComponent;
    public CheeseDecorator(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        name = "치즈"; // "치즈 " + "피자"
        price = 3000;
        size = pizzaComponent.getSize();
    }
    @Override
    public int getSize() {
        return size;
    }
    public String getName() { return name + pizzaComponent.getName(); }
    public int getPrice() { return price + pizzaComponent.getPrice(); }
}