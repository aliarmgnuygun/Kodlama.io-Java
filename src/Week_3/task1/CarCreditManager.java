package Week_3.task1;

public class CarCreditManager extends BaseCreditManager implements CreditManager{
    @Override
    public void Calculate() {
        System.out.println("The Car credit has been calculated.");
    }

}
