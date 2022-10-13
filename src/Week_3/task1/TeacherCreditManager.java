package Week_3.task1;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {
    @Override
    public void Calculate() {
        System.out.println("Teacher's credit has been calculated.");
    }

}
