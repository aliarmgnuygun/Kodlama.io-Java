package Week_2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new TeacherCreditManager());
        creditUI.CalculateCredit(new SoldierCreditManager());
    }
}