class Pizza extends PizzaComponent{
    private int size;
    private String name;
    private int price;
    
    public Pizza(int size) {
        this.size=size;
        name = "피자";
        price = 20000;
    }
    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}