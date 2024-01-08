public class Notebook extends Goods {
    protected int ram;
    protected int hdd;

    public Notebook(String name, String color,int price, int ram, int hdd) {
        super(name, color, price);
        this.ram = ram;
        this.hdd = hdd;
    }

    public int GetRam() {
        return ram;
    }

    public int GetHdd() {
        return hdd;
    }


    @Override
    public String displayInfo(){
        return String.format("Ноутбук: %s; Цвет: %s; Цена: %d руб.; ОЗУ: %d GB; Диск: %d GB.",
                name, color, price, ram, hdd);
    }
}
