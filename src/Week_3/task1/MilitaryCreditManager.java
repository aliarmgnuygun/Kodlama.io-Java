package Week_3.task1;

public class MilitaryCreditManager extends BaseCreditManager implements CreditManager {
    @Override
    public void Calculate() {
        System.out.println("Military's credit has been calculated.");
    }

}
