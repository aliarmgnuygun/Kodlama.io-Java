package Week_3.task1;

public abstract class BaseCreditManager implements CreditManager{

    public abstract void Calculate(); // abstract means that the method is not completed.

    @Override
    public void Save() {
        System.out.println("The Credit has been saved.");
    }
}
