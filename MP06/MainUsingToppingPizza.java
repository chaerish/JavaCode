class MainUsingToppingPizza {
    public static void main(String[] args) {
        ToppingPizza pizza = new ToppingPizza("Pepperoni", 15, ToppingsPrice.PEPPERONI);
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
        pizza = new ToppingPizza("Cheese", 15, ToppingsPrice.CHEESE);
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}