class MainUsingInheritedPizza {
    public static void main(String[] args) {
        Pizza pizza = new InheritedPepperoniPizza(15);
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
        pizza = new InheritedCheesePizza(15);
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
