package Week_3.task1;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(),new CarCreditManager());
        customerManager.GiveCredit();

    }
}
