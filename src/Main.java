//import java.util.Arrays;
//import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Телефон", 20000, "Электроника");
        Product p2 = new Product(2, "Часы", 5000, "Аксессуары");
        Product p3 = new Product(1, "Телефон", 19000, "Электроника");  // совпадает с p1 по id и category
        Product p4 = new Product(3, "Ноутбук", 45000, "Электроника");
        Product p5 = new Product(2, "Часы", 5000, "Часы");             // другая категория, несмотря на id

        // Вывод товаров
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        // Попарное сравнение товаров
        System.out.println("p1.equals(p3): " + p1.equals(p3));  // true по условию (id и category совпадают)
        System.out.println("p1.equals(p2): " + p1.equals(p2));

        System.out.println("p2.equals(p5): " + p2.equals(p5));  // false, разные категории

        // Создание заказов
        Order order1 = new Order("Иванов", new Product[]{p1, p2, p4});
        Order order2 = new Order("Петров", new Product[]{p1, p2, p4});
        Order order3 = new Order("Иванов", new Product[]{p3, p2, p4});  // p3 равен p1 по equals
        Order order4 = new Order("Иванов", new Product[]{p1, p4, p2});  // другой порядок

        // Вывод заказов
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);

        // Попарное сравнение заказов
        System.out.println("order1.equals(order2): " + order1.equals(order2)); // false, разные customer
        System.out.println("order1.equals(order3): " + order1.equals(order3)); // true, p1 и p3 сравнимы
        System.out.println("order1.equals(order4): " + order1.equals(order4)); // false, порядок товаров разный
    }

}
