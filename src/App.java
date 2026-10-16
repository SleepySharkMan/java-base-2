public class App {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        bankAccount.setBalance(-500);
        System.out.println(bankAccount.getBalance());
        System.out.println();

        System.out.println("Задача №2");
        Person fPerson = new Person("Ivan", "Ivanov", 10);
        Person sPerson = new Person("Petr", "Petrov", 20);
        Person tPerson = new Person("Test", "Testov", 30);
        fPerson.introduce();
        sPerson.introduce();
        tPerson.introduce();
        System.out.println();

        System.out.println("Задача №3");
        System.out.println(MathHelper.sum(10, 5));
        System.out.println(MathHelper.max(10, 5));
        System.out.println(MathHelper.isEven(10));
        System.out.println();

        System.out.println("Задача №4");
        Visitor v1 = new Visitor();
        System.out.println(v1.getTotalVisitors());
        Visitor v2 = new Visitor();
        System.out.println(v2.getTotalVisitors());
        Visitor v3 = new Visitor();
        System.out.println(v3.getTotalVisitors());
        Visitor v4 = new Visitor();
        System.out.println(v4.getTotalVisitors());
        Visitor v5 = new Visitor();
        System.out.println(v5.getTotalVisitors());
        // переменная статичная - значит она принадлежит классу, а не экземпляру этого
        // класса,
        // поэтому значение одинаковое если вызвать getTotalVisitors() через любой из
        // пяти объектов
        System.out.println();

        System.out.println("Задача №5");
        Product milk = new Product("Молоко", 80);
        Product bread = new Product("Хлеб", 40);
        Product eggs = new Product("Яйца", 120);
        Product cheese = new Product("Сыр", 250);
        Cart cart = new Cart();
        cart.addProduct(milk, 2);
        cart.addProduct(bread, 1);
        cart.addProduct(eggs, 10);
        cart.addProduct(cheese, 1);
        cart.addProduct(milk, 1);
        System.out.println("Всего товаров: " + cart.getProductCount());
        System.out.println("Общая сумма: " + cart.getTotalPrice());
    }
}
