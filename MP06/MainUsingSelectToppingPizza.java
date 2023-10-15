import java.util.ArrayList;
import java.util.List;

class MainUsingSelectToppingPizza {
    public static void main(String[] args) {
        List<String> list;
        LoadToppings loadToppings = new LoadToppings("toppings.txt");
        list = loadToppings.load();
        PizzaComponent pizza = new Pizza(15);
        for (String topping : list) {
                switch (topping) {
                    case "Pepperoni":
                        pizza = new PepperoniDecorator(pizza);
                        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
                        break;
                    case "Cheese":
                        pizza = new CheeseDecorator(pizza);
                        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
                        break;
                    case "Potato":
                        pizza = new PotatoDecorator(pizza);
                        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
                        break;
                    case "Bulgogi":
                        pizza = new BulgogiDecorator(pizza);
                        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
                        break;
                    default:
                        System.out.println("Invalide topping\n");
                        break;
                }
            }
    }
}