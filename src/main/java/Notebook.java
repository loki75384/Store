import java.util.HashSet;
import java.util.Set;

public class Notebook {
    protected int ram;
    protected int hdd;
    protected String color;

    public Notebook(int ram, int hdd, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
    }

    public int GetRam() {
        return ram;
    }

    public int GetHdd() {
        return hdd;
    }

    public String GetColor() {
        return color;
    }

    public String displayInfo() {
        return String.format("Оперативная память: %d\nОбъем ЖД: %d\nЦвет: %s", ram, hdd, color);
    }
}
