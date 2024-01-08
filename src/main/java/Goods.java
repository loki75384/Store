public class Goods {
    protected String name;
    protected String color;
    protected int price;

    public Goods(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String displayInfo(){
        return String.format("Название: %s; Цвет: %s; Цена: %d руб.", name, color, price);
    }
}
