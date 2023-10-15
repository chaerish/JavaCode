class InheritedPepperoniPizza extends Pizza {
    int price;
    public InheritedPepperoniPizza(int size) {
        super(size);
        price = ToppingsPrice.PEPPERONI;
    }
    public String getName() { return "페퍼로니 " +  super.getName(); }
    public int getPrice() { return price + super.getPrice(); }
}

class InheritedCheesePizza extends Pizza {
    public InheritedCheesePizza(int size) {
        super(size);
    }

    public String getName() { return "치즈 " + super.getName(); }
    public int getPrice() { return ToppingsPrice.CHEESE + super.getPrice(); }
}