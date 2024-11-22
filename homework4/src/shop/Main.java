package shop;

/**
 *  * Задание 2
 *  * Задача: Эмуляция интернет-магазина
 *  * 1. написать классы покупатель, товар и заказ;
 *  * 2. создать массив покупателей, массив товаров и массив заказов;
 *  * 3. создать статический метод “совершить покупку” со строковыми
 *  * параметрами, соответствующими полям объекта заказа. Метод
 *  * должен вернуть объект заказа
 *  * 4. Если в метод передан несуществующий покупатель, товар или
 *  * отрицательное количество, метод должен выбросить
 *  * соответствующее исключение;
 *  * 5. Вызвать метод совершения покупки несколько раз таким образом,
 *  * чтобы заполнить массив покупок возвращаемыми значениями.
 *  * Обработать исключения.
 *  * 6. Вывести в консоль итоговое количество совершённых покупок после
 *  * выполнения приложения.
 *  ---------------------------------------------------------------------
 *  Домашнее задание
 * Задачи:
 * 1. Выполнить все задания семинара, если они не были решены, без ограничений по
 * времени.
 * 2. В класс покупателя добавить перечисление с гендерами, добавить в сотрудника
 * свойство “пол” со значением перечисления. добавить геттеры, сеттеры.
 * 3. Добавить перечисление с праздниками (нг, 08.03,23.02), в основной программе
 * написать метод, принимающий массив сотрудников и поздравляющий всех
 * сотрудников с новым годом, женщин с 08.03, мужчин с 23.02.
 */

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addCustomer(new Customer("Q", "Q", "Q", Gender.MALE, 21, "123"));
        shop.addCustomer(new Customer("A", "A", "A", Gender.FEMALE,22, "124"));
        shop.addCustomer(new Customer("B", "B", "B", Gender.MALE,23, "125"));

        shop.addProduct(new Product("1a", 1));
        shop.addProduct(new Product("2b", 2));
        shop.addProduct(new Product("3c", 3));

        try {
            shop.makeOrder(shop.getCustomers().get(0), shop.getProducts().get(1), 3);
            shop.makeOrder(shop.getCustomers().get(0), shop.getProducts().get(0), 5);
//            shop.makeOrder(new Customer("Z", "Z", "Z", Gender.MALE,22, "213"),
//                                    shop.getProducts().get(0), 1);
//            shop.makeOrder(shop.getCustomers().get(0), new Product("4z", 1), 1);
            shop.makeOrder(shop.getCustomers().get(0), shop.getProducts().get(0), 0);
        }
        catch (NotFoundCustomerException | NotFoundProductException | NotPositiveAmountException e) {
            System.out.println(e.getMessage());
        }
        finally {
            for (Order order : shop.getOrders()) {
                System.out.println(order);
            }
            System.out.println("Count of orders is "  + shop.getOrders().size());
        }

        shop.congratulate();
    }
}
