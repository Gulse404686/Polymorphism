public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        CustomerManager customerManager2 = new CustomerManager(new ConsoleLogger());
        CustomerManager customerManager3 = new CustomerManager(new BaseLogger());

        customerManager.add();
        customerManager2.add();
        customerManager3.add();


    }
}