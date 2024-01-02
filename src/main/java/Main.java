import java.util.*;

public class Main extends Notebook {
    protected int ram;
    protected int hdd;
    protected String color;

    public Main(int ram, int hdd, String color) {
        super(ram, hdd, color);
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
    }

    public static void main(String[] args) {
        Notebook nb1 = new Notebook(8,500,"black");
        Notebook nb2 = new Notebook(16,1000,"blue");
        Notebook nb3 = new Notebook(32,2000,"red");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(nb1);
        notebooks.add(nb2);
        notebooks.add(nb3);

        System.out.println("1. Показать все товары");
        System.out.println("2. Поиск ноутбука по ОЗУ");
        System.out.println("3. Поиск ноутбука по объему диска");
        System.out.println("4. Выход");
        System.out.println("Введите цифру пункта меню: ");

        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            Integer choice = Integer.parseInt(scanner.next());
            if (choice == 1) {
                for (Notebook notebook : notebooks) {
                    System.out.println(notebook.displayInfo());
                }




