package Week_3.task1;

public class CustomerManager {

    private Customer customer;
    private CreditManager creditManager;

    public CustomerManager(Customer customer,CreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void Save() {
        System.out.println("Customer has been saved.");
    }

    public void Delete() {
        System.out.println("Customer has been deleted.");
    }

    public void GiveCredit(){
        creditManager.Calculate();
        System.out.println("Credit has been given.");
    }
}
