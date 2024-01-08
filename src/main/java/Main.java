import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("Asus", "metallic", 16000, 1024, 1000);
        Notebook nb2 = new Notebook("HP", "black", 8000, 256, 500);
        Notebook nb3 = new Notebook("Lenovo", "silver", 24000, 512, 750);

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
            int choice = Integer.parseInt(scanner.next());
            if (choice == 1) {
                for (Notebook notebook : notebooks) {
                    System.out.println(notebook.displayInfo());
                }
            } else if (choice == 2) {
                System.out.println("Введите минимальное значение ОЗУ: ");
                int minRam = Integer.parseInt(scanner.next());
                boolean flag = false;
                for (Notebook notebook : notebooks) {
                    if (minRam >= notebook.GetRam()) {
                        System.out.println(notebook.displayInfo());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков не найдено");
                    System.exit(0);
                }
            } else if (choice == 3) {
                System.out.println("Введите минимальный объем диска:");
                int minHdd = Integer.parseInt(scanner.next());
                boolean flag = false;
                for (Notebook notebook : notebooks) {
                    if (minHdd >= notebook.GetHdd()) {
                        System.out.println(notebook.displayInfo());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков не найдено");
                    System.exit(0);
                }
            } else if (choice == 4) {
                System.exit(0);
            }
            else{
                System.out.println("Такого пункта нет. Попробуйте еще раз.");
                System.exit(0);
            }
        }
    }
}



